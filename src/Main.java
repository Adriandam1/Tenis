

public class Main {

    /**
     * Ventaja jugador1
     */
    public static final int VENTAJAJ1 = 1;
    /**
     * Ventaja jugador2
     */
    public static final int VENTAJAJ2 = -1;
    /**
     * Victoria jugador1
     */
    public static final int VICTORIAJ1 = 2;
    /**
     * Victoria jugador2
     */
    public static final int VICTORIAJ2 = -2;

    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int j1_puntos, int j2_puntos) {
        String puntuacion = "";
        int marcador=0;

        //Aqui gestionamos los empates a puntos
        if (j1_puntos == j2_puntos) {
            switch (j1_puntos)
            {
                case 0:
                    puntuacion = "Love-All";
                    break;
                case 1:
                    puntuacion = "Fifteen-All";
                    break;
                case 2:
                    puntuacion = "Thirty-All";
                    break;
                case 3:
                    puntuacion = "Forty-All";
                    break;
                default:
                    puntuacion = "Deuce";
                    break;

            }
        }
        //Aqui gestionamos cuando hay ventaja(+40ptos)
        else if (j1_puntos >=4 || j2_puntos >=4)
        {
            int dif_puntos = j1_puntos-j2_puntos;
            if (dif_puntos== VENTAJAJ1) puntuacion ="Advantage player1";
            else if (dif_puntos == VENTAJAJ2) puntuacion ="Advantage player2";
            else if (dif_puntos>= VICTORIAJ1) puntuacion = "Win for player1";
            else if (dif_puntos>= VICTORIAJ2) puntuacion = "Win for player2";
            else puntuacion ="Error, puntuacion imposible";
        }
        else
        {
            // Resto de casuisticas
            for (int i=1; i<3; i++)
            {
                if (i==1) marcador = j1_puntos;
                else { puntuacion+="-"; marcador = j2_puntos;}
                switch(marcador)
                {
                    case 0:
                        puntuacion+="Love";
                        break;
                    case 1:
                        puntuacion+="Fifteen";
                        break;
                    case 2:
                        puntuacion+="Thirty";
                        break;
                    case 3:
                        puntuacion+="Forty";
                        break;
                }
            }

        }
    return puntuacion;
    }
}