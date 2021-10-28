public class Teste {
    public static void main(String args[]){
        Empregado empregado=new Empregado();

        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(7000);
        empregado.setImposto(2500);
        empregado.setNome("-> Robson - Joyce - Pala - Nickolas - Derik - Isabela - Masami - Yumi");
        empregado.setEndereco("-> São Paulo - Campinas - Pompeia - Marília");
        empregado.setTelefone("-> Área 014 019 e 011");

        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.calculaSalario());
    }
}
