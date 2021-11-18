package Aula05;

public class PrincipalMesa {
    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Kata","kathy");
        UsuarioJogo usuario2 = new UsuarioJogo("Eduardo","Dudu");
        //criando pontuacao para os usuarios
        usuario1.aumentarPontuacao(1000);
        usuario2.aumentarPontuacao(2000);

        //criando niveis pro usuario
        usuario1.subirNivel(3);
        usuario2.subirNivel(7);

        //dando bonus pro usuario1
        usuario1.bonus(3000);

        //verificando a pontuacao atual
        System.out.println(usuario1.getPontuacao());

        //usando o set para nivel do usuario2
        usuario2.setNivel(5);
        System.out.println(usuario2.getNivel());

    }
}
