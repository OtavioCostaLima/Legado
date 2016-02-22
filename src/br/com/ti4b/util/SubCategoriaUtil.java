package br.com.ti4b.util;

/**
 *
 * @author Otavio Costa
 */
public class SubCategoriaUtil {

    public String setarSubCategoria(String categoria, int idade, String DMA, String sexo, int parida) {
        String subCategoria = null;
        //  System.out.print("cate :" + categoria + " idade:" + idade + " DMA:" + DMA + " sexo:" + sexo);
        //  System.out.println("");
        //  Dia(s), Mês(es), Ano(s)
        switch (categoria) {
            case "BOVINO":
                switch (DMA) {
                    case "Dia(s)":
                        if (idade > 0 && idade <= 365) {
                            //bezerro
                            subCategoria = "BEZERRO";
                        } else if (idade > 365 && idade <= 730) {
                            //Garrota
                            switch (sexo) {
                                case "M":
                                    subCategoria = "NUVILHOTE";
                                    break;
                                case "F":
                                    if (parida == 0) {
                                        subCategoria = "NUVILHA";
                                    } else if (parida == 1) {
                                        subCategoria = "VACA";
                                    } else {
                                        subCategoria = "NUVILHA";
                                    }
                                    break;
                            }
                        } else if (idade > 730) {
                            switch (sexo) {
                                case "M":
                                    subCategoria = "GARROTE";
                                    break;
                                case "F":
                                    if (parida == 0) {
                                        subCategoria = "NUVILHA";
                                    } else if (parida == 1) {
                                        subCategoria = "VACA";
                                    } else {
                                        subCategoria = "NUVILHA";
                                    }
                                    //Novilha/Vaca
                                    break;
                            }
                        }
                        break;
                    case "Mês(es)":
                        if (idade > 0 && idade <= 12) {
                            //bezerro
                            subCategoria = "BEZERRO";
                        } else if (idade > 12 && idade <= 24) {
                            //Garrota
                            switch (sexo) {
                                case "M":
                                    subCategoria = "NUVILHOTE";
                                    break;
                                case "F":
                                    if (parida == 0) {
                                        subCategoria = "NUVILHA";
                                    } else if (parida == 1) {
                                        subCategoria = "VACA";
                                    } else {
                                        subCategoria = "NUVILHA";
                                    }
                                    break;
                            }
                        } else if (idade > 24) {
                            switch (sexo) {
                                case "M":
                                    subCategoria = "GARROTE";
                                    break;
                                case "F":
                                    if (parida == 0) {
                                        subCategoria = "NUVILHA";
                                    } else if (parida == 1) {
                                        subCategoria = "VACA";
                                    }
                                    break;
                            }
                        }
                        break;
                    case "Ano(s)":
                        if (idade == 1) {
                            //bezerro
                            subCategoria = "BEZERRO";
                        } else if (idade > 1 && idade <= 2) {
                            switch (sexo) {
                                case "M":
                                    subCategoria = "NUVILHOTE";
                                    break;
                                case "F":
                                    if (parida == 0) {
                                        subCategoria = "NUVILHA";
                                    } else if (parida == 1) {
                                        subCategoria = "VACA";
                                    } else {
                                        subCategoria = "NUVILHA";
                                    }
                                    break;
                            }
                        } else if (idade > 2) {
                            //Novilha/Vaca
                            switch (sexo) {
                                case "M":
                                    subCategoria = "GARROTE";
                                    break;
                                case "F":
                                    if (parida == 0) {
                                        subCategoria = "NUVILHA";
                                    } else if (parida == 1) {
                                        subCategoria = "VACA";
                                    } else {
                                        subCategoria = "NUVILHA";
                                    }
                                    break;
                            }
                        }
                        break;
                }
                break;
            case "OVINO":
                if (DMA.equals("Dia(s)")) {
                    if (idade > 0 && idade <= 90) {
                        //Borrego
                        subCategoria = "BURREGO LACTANTE";
                    }
                    if (idade > 90 && idade <= 210) {
                        // Borrego desmamado
                        subCategoria = "BURREGO DESLACTANTE";
                    }
                    if (idade > 210) {
                        //  Carneiro
                        subCategoria = "CARNEIRO";
                    }
                }
                if (DMA.equals("Mês(es)")) {
                    if (idade > 0 && idade <= 3) {
                        //Borrego
                        subCategoria = "BURREGO LACTANTE";
                    }
                    if (idade > 3 && idade <= 7) {
                        // Borrego desmamado
                        subCategoria = "BURREGO DESLACTANTE";
                    }
                    if (idade > 7) {
                        //  Carneiro
                        subCategoria = "CARNEIRO";
                    }
                }
                if (DMA.equals("Ano(s)")) {
                    if (idade > 1) {
                        //  Carneiro
                        subCategoria = "CARNEIRO";
                    }
                }
                break;
            case "CAPRINO":
                if (DMA.equals("Dia(s)")) {
                    if (idade > 0 && idade <= 90) {
                        //Cabrito
                        subCategoria = "CABRITO LACTANTE";
                    }
                    if (idade > 90 && idade <= 210) {
                        //Cabrito desmamado
                        subCategoria = "CABRITO DESLACTANTE";
                    }
                    if (idade > 210) {
                        // Bode
                        subCategoria = "BODE";
                    }
                }
                if (DMA.equals("Mês(es)")) {
                    if (idade > 0 && idade <= 3) {
                        //Cabrito
                        subCategoria = "CABRITO LACTANTE";
                    }
                    if (idade > 3 && idade <= 7) {
                        //Cabrito desmamado
                        subCategoria = "CABRITO DESLACTANTE";
                    }
                    if (idade > 7) {
                        // Bode
                        subCategoria = "BODE";
                    }
                }
                if (DMA.equals("Ano(s)")) {
                    if (idade > 1) {
                        // Bode
                        subCategoria = "BODE";
                    }
                }
                break;
            case "SUÍNO":
                if (DMA.equals("Dia(s)")) {
                    if (idade > 0 && idade <= 90) {
                        //Leitões
                        subCategoria = "LEITÃO";
                    }
                    if (idade > 90) {
                        //porco
                        subCategoria = "PORCO";
                    }
                }
                if (DMA.equals("Mês(es)")) {
                    if (idade > 0 && idade <= 3) {
                        //Leitões
                        subCategoria = "LEITÃO";

                    }
                    if (idade > 3) {
                        //porco
                        subCategoria = "PORCO";
                    }
                }
                if (DMA.equals("Ano(s)")) {
                    if (idade > 1) {
                        //porco
                        subCategoria = "PORCO/ADULTO";
                    }
                }
                break;
        }

        /* System.out.println(
         "sub " + subCategoria);*/
        return subCategoria;
    }
}
