package Manual;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ejemplo_condicional_switch {

    public static void main(String[] args) {

        System.out.println("Elige en que fecha nacistes \n 1= 21/ENERO-18/FEBRERO.\n 2= 19/FEBRERO-20/MARZO.\n 3= 21/MARZO-20/ABRIL.\n 4= 21-ABRIL-20/MAYO.\n 5= 21/MAYO-20/JUNIO.\n"
                + " 6= 21/JINIO-22/JULIO.\n 7= 23/JULIO-23/AGOSTO.\n 8= 24/AGOSTO-23/SEPTIEMBRE.\n 9= 24/SEPTIEMBRE-22/OCTUBRE.\n 10= 23/OCTUBRE-22/NOVIEMBRE.\n 11= 23/NOVIEMBRE-20/DICIEMBRE.\n 12= 21/DICIEMBRE-20/ENERO.");

        String entrada = JOptionPane.showInputDialog("elige una opcion de las 12 anteriores");

        int dato = Integer.parseInt(entrada);

        switch (dato) {

            case 1:

                System.out.println("ACUARIO : Los acuarios tienen una personalidad fuerte y atractiva. Hay dos tipos de acuarios: uno es tímido, sensible, y paciente.\n "
                        + "El otro tipo de acuario es exuberante, vivo y puede llegar a esconder las profundidades de su personalidad debajo de un aire frívolo.");

                break;
            case 2:

                System.out.println("PISCIS : Los Piscis son personas tranquilas, pacientes y amables.\n"
                        + " Son sensibles a los sentimientos de los demás y responden con simpatía y tacto al sufrimiento de las personas que los rodean.\n "
                        + "Son muy queridos por los demás porque tienen un carácter afable, cariñoso y amable.");
                break;
            case 3:

                System.out.println("ARIES : Un Aries es una persona llena de energía y entusiasmo.\n "
                        + "Tienen una energía envidiable que a veces les lleva a ser agresivos, inquietos, argumentativos, tercos.\n"
                        + " Aries es el primer signo del zodiaco, y en este sentido su papel es empezar algo y liderar.");
                break;
            case 4:

                System.out.println("TAURO : Precavido y con gran sentido práctico, Tauro posee gran constancia para el trabajo y mucha responsabilidad.\n"
                        + " Le da mucha importancia a lo material pero también al amor.\n Tauro es un signo amoroso y cálido, que depende siempre del amor para poder seguir adelante.");
                break;
            case 5:

                System.out.println("GEMINIS : La versatilidad es la palabra clave ideal para este signo dual.\n"
                        + " Expresivo e inteligente, Géminis presenta dos aspectos distintivos de su personalidad, y uno nunca puede estar seguro con cual se va a encontrar cara a cara.\n"
                        + " Por un lado, puede ser extrovertido, coqueto, comunicativo y listo para la diversión.");
                break;
            case 6:

                System.out.println("CANCER : Cáncer, cuarto signo del Zodíaco, cardinal, y primero del elemento Agua, representa lo femenino, lo fecundo y está regido por las emociones de la Luna.\n "
                        + "Es el signo del hogar, de las raíces, la madre. Sus nativos poseen una gran sensibilidad emocional y una profunda fe");
                break;
            case 7:

                System.out.println("LEO : Leo es un signo de fuego regido por el sol, naturalmente son personas sociables y extrovertidas.\n Disfrutan de relacionarse con mucha gente y de tener muchos amigos.\n"
                        + " Les gusta llamar la atención, son carismáticos y orgullosos.");
                break;
            case 8:

                System.out.println("VIRGO : Nunca pisa un suelo que no conoce, es honesto y muy inteligente. Precisos y exactos, aunque pueden también ser minuciosos e irritables.\n"
                        + " Generalmente se preocupan por ser meticulosos y limpios. Virgo es un buen amigo que siempre está dispuesto a ayudar.");
                break;
            case 9:

                System.out.println("LIBRA : Libra ocupa el séptimo lugar del Zodíaco. Su emblemática balanza es símbolo de los ideales de equilibrio, justicia y equidad que persiguen los nativos del signo.\n "
                        + "Es uno de los tres signos de Aire, junto con Géminis y Acuario, de ahí su naturaleza comunicativa, mental e idealista.");
                break;
            case 10:

                System.out.println("ESCORPIO : El Escorpio es un signo intenso con una energía emocional única en todo el zodiaco.\n "
                        + "Aunque puedan aparecer tranquilos, los Escorpio tienen una agresión y magnetismo interno escondidos dentro.\n"
                        + " El Escorpio es tremendamente poderoso y su carácter puede causar enormes beneficios o grandes riesgos para los demás.");
                break;
            case 11:

                System.out.println("SAGITARIO : Muy romántico. Agradable con todas las personas. El sagitario es uno de los signos más positivos del zodiaco.\n "
                        + "Tienen la mente abierta a nuevas ideas y experiencias y mantienen un actitud optimista incluso cuando las cosas se les ponen difíciles.");
                break;
            case 12:

                System.out.println("CAPRICORNIO : Un Capricornio es un de los signos del zodiaco más estables, seguros y tranquilos.\n "
                        + "Son trabajadores, responsables, prácticos y dispuestos a persistir hasta sea necesario para conseguir su objetivo.\n"
                        + " Son fiables y muchas veces tienen el papel de terminar un proyecto iniciado por uno de los signos más pioneros.\n"
                        + " Les encanta la música. Un Capricornio exige mucho de sus empleados, familiares y amigos, pero solo porque se lo exige también a si mismo.\n"
                        + " Suelen ser personas justas. No se encuentran entre los signos del zodiaco más felices. Más bien tienden a veces hacia el melancolizo y pesimismo.\n"
                        + " Cuando un Capricornio sufre depresión debe buscar ayuda.\n"
                        + " De hecho, un Capricornio debe siembre intentar mantener una estabilidad emocional a través de la meditación, respiración o actividades que le ayudan a relajarse y no perder control de sus emociones.");
                break;
        }

    }

}
