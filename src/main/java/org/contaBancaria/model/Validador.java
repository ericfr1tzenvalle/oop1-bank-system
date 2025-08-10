package org.contaBancaria.model;

public class Validador {


    //Validações de CPF
    public static boolean verificaCpf(String cpf){
        cpf = cpf.replaceAll("\\D", "");


        if(cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")){
            return false;
        }

        try {
            // Calculamos primeiro dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int resto = 11 - (soma % 11);
            int digito1 = (resto >= 10) ? 0 : resto;

            // Calculamos segundo dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            resto = 11 - (soma % 11);
            int digito2 = (resto >= 10) ? 0 : resto;

            // Confererimos se bate com o CPF informado
            return digito1 == (cpf.charAt(9) - '0') &&
                    digito2 == (cpf.charAt(10) - '0');
        } catch (NumberFormatException e) {
            return false;
        }

    }

   //Validações se a conta existe no banco
    public static Conta verificaSenhaConta(Banco banco,String cpf,String senha){
        for(Conta c: banco.getContas()){
            if(c.getCpf().equals(cpf) && c.getSenha().equals(senha)){
                return c;
            }

        }
        return null;
    }
}
