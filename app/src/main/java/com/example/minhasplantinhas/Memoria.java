package com.example.minhasplantinhas;

import java.util.ArrayList;
import java.util.Arrays;

public class Memoria extends MinhasPlantas{

    private static final String mediaLuz = "É uma planta resistente e forte que consegue sobreviver no sol pleno e também em locais com pouca luminosidade. Prefere ambientes quentes com luz natural.";
    private static final String poucaLuz = "As espécies do gênero precisam de pouca luz solar para manter suas belas cores, muito pode queimar a folhagem. Para alcançar esse meio termo, coloque-as no chão ou em uma mesa em uma sala iluminada, longe da janela.";
    private static final String meiaSombra = "A planta não necessita de luz direta, no entanto é importante fazer ela receber um pouco de sol para não perder sua coloração. Ótima em ambientes de meia-sombra. Adora ambientes quentes.";
    private static final String regaTropical = "Por ser uma planta tropical, necessita de solo umido, mas não encharcado. Para verificar a umidade da terra, basta colocar o dedo nela e verificar se sairá sujo.";
    private static final String regaPouca = "Evite regar demais, regue apenas quando a camada superior do solo estiver seco ou se as folhas estiverem secas.";
    private static final String podaPouca = "A planta não necessita de podas. Apenas tome cuidado com as folhas secas ou amareladas.";
    private static final String podaGrande = "A poda só é necessária caso a planta comece a produzir muitas folhas e seus caules se tornem muito altos, fazendo com que a planta perca a sua força. A poda estimulará o crescimento das folhas remanescentes, fortalecendo a planta como um todo.";
    private static final String podaCuidado = "Certifique-se de que a lâmina de corte está afiada para que os cortes estejam limpos e uniformes. Os cortes irregulares são inestéticos e podem levar a doenças. Mergulhe o seu corta-relva ou faca numa mistura de lixívia e água para garantir que está livre de agentes patogénicos.";
    private static final String podaSem = "Evite podar. Ao contrário de outras espécies domésticas, a poda dessa planta não estimula o crescimento. Ela é uma planta que cresce bem devagar, e a poda causa uma lesão que desacelera ainda mais o crescimento por causa da recuperação.";
    private static final String fertilizanteBovino = "O adubo deve ser primordialmente o calcário e o nitrogênio. Além disso, ao menos uma vez a cada 2 meses, essa planta recebe muito bem um pouco de substrato orgânico, ou até mesmo esterco bovino, caso você encontre esse material em mercados agrícolas ou tenha à disposição na sua região.";
    private static final String fertilizanteOrganico = "Geralmente é utilizado uma mistura orgânica de terra comum, substrato e fibra de coco.";
    private static final String fertilizanteLiquido = "Para um crescimento saudável, utilize um fertilizante líquido. Ideal para plantas de folhagem.";
    private static final String plantaVenenosa = "Esta planta é venenosa, portanto deixe longe de crianças ou animais de estimação. Sua ingestão pode causar irritação, inchaço e problemas gastrointestinais.";
    private static final String cuidadosSem = "Sem detalhes adicionais";

    //Dados cardview
    static ArrayList<String> nomeDasPlantas = new ArrayList<String>(Arrays.asList("Antúrio", "Comigo-ninguém-pode", "Dracena", "Espada-de-são-jorge", "Imbé", "Lírio da Paz", "Orquídea", "Samambaia"));
    static ArrayList<String> especiesDasPlantas = new ArrayList<String>(Arrays.asList("Anthuriums andraeanum", "Dieffenbacchia", "Dracaenas Massangeana", "Sansevieria trifasciata", "Philodendrons", "Spathiphyllum wallisi", "várias espécies", "várias espécies"));
    static ArrayList<String> txtAgua = new ArrayList<String>(Arrays.asList("Umida", "Umida", "Umida", "Umida", "Muita Água", "Umido", "Pouca Água", "Umida"));
    static ArrayList<String> txtLuz = new ArrayList<String>(Arrays.asList("Manhã e Quente", "Tarde", "Pouca Luz", "Manhã e tarde", "Manhã e Tarde", "Morno", "Manhã", "Manhã e Quente"));
    static ArrayList<String> txtAmbiente = new ArrayList<String>(Arrays.asList("Sombra", "Meia-Sombra", "Doméstico", "Externo", "Externo", "Doméstico", "Doméstico", "Doméstico"));
    //Imagem
    static ArrayList<Integer> imagemPlanta = new ArrayList<Integer>(Arrays.asList(R.drawable.anturios,R.drawable.comigo_ninguem_pode,R.drawable.dracena,R.drawable.espada_sao_jorge,R.drawable.imbe,R.drawable.lirio,R.drawable.orquidea,R.drawable.samambaia));
    static ArrayList<Integer> imagemLuz = new ArrayList<Integer>(Arrays.asList(R.drawable.sun_color,R.drawable.sun_color,R.drawable.night,R.drawable.sun_color,R.drawable.sun_color,R.drawable.sun_color,R.drawable.sun_color,R.drawable.sun_color));


    //dados detalhes
    static ArrayList<String> listaResumo = new ArrayList<String>(Arrays.asList("Os Antúrios são uma das plantas mais utilizadas em ambientes internos devido as suas folhas brilhantes e flores bonitas. Se bem cuidadas, podem ser mantidas floridas o ano todo.", "Originária da Colômbia e da Costa Rica, a planta é cercada por mitos e crenças: acredita-se que ela seja capaz de afastar as energias negativas.", "A Dracena é uma planta que se desenvolve bem em ambientes internos. Perfeita para escritórios e aceita ser negligênciada um pouco.", "A espada-de-são-jorge é uma planta resistente que tem folhas compridas e largas. Graças à sua adaptabilidade e tolerância, ela é uma ótima planta para qualquer ambiente.", "O imbé é uma planta tropical que cresce de forma invasiva. Isto é, ela necessita de uma haste para seu crescimento, a fim de abarcar uma grande área, mas sempre à sombra de algum objeto, seja um muro ou mesmo uma outra árvore. Por isso, o imbé gosta muito de crescer ao lado de algum suporte.", "Bonitos e fáceis de cuidar, os lírios da paz são algumas das plantas caseiras mais populares. Basta tratar bem deles e você terá uma flor maravilhosa em casa por vários e vários anos", "As orquídeas são verdadeiras aliadas para a decoração. São espécies delicadas e muito charmosas, capazes de se adaptar bem em vários ambientes. E com os cuidados certos é possível manter a saúde da planta por um longo tempo.", "As samambaias, ou fetos, possuem tecidos vasculares, folhas verdadeiras, se reproduzem através de esporos e não produzem sementes ou flores.\n" +
            "Apesar de não produzirem frutos e dependerem da dispersão de seus esporos para colonizar novas áreas, as samambaias são muito bem distribuídas nas zonas tropicais, subtropicais e temperadas do mundo."));
    static ArrayList<String> listaIluminacao = new ArrayList<String>(Arrays.asList("Devem ser mantidas em ambientes claros e aquecidos, sem contato direto com o sol. De preferência em janelas com ângulos que capturem bem o sol do inicio da manhã.", meiaSombra, poucaLuz, mediaLuz, "A iluminação para o imbé é um fator decisivo para o crescimento dessa planta. Por ter uma característica de se mover, assim que ela começar o seu desenvolvimento você irá notar que ela se afastará de cada vez mais para os lados em que o sol tem menos intensidade, caso esteja em um local com muita luminosidade.", "O Lírio da Paz cresce melhor em luz indireta média ou brilhante. Nunca permita que sua planta receba luz solar direta, pois as folhas podem queimar. Como muitas plantas tropicais domésticas, o Lírio da Paz prefere um local com bastante umidade.", "Elas tendem a preferir o sol da manhã, e o recomendado é trabalhar com luminosidade indireta durante a tarde, quando está mais quente. A barreira solar pode ser filtrada por telas de sombreamento.", "Por serem de regiões tropicais, as sambaias não podem ficar em regiões muito frias, de preferência por volta dos 21º. São sensíveis a luz solar, portanto devem ficar em locais abrigados e sem muitos ventos."));
    static ArrayList<String> listaRega = new ArrayList<String>(Arrays.asList(regaTropical, regaTropical, regaPouca, regaPouca, regaTropical, regaPouca, regaPouca, regaTropical));
    static ArrayList<String> listaPoda = new ArrayList<String>(Arrays.asList(podaPouca, podaGrande, podaCuidado, podaSem, "A pode do imbé deverá se dar nos períodos de inverno. Essa planta não lida bem com grandes períodos de frio, portanto, reserve sua seiva para nutrir-se enquanto o sol ainda está aparente.", "Não necessita", "Não precisa podar", "É recomendado fazer a poda pelo menos uma vez ao ano, mas se houver galhos secos ou mortos, estes devem ser retirados rapidamente."));
    static ArrayList<String> listaFertilizantes = new ArrayList<String>(Arrays.asList(fertilizanteOrganico, "A planta comigo-ninguém-pode necessita de um solo que seja rico em matéria orgânica e que tenha uma boa capacidade de drenagem. "+fertilizanteOrganico, fertilizanteLiquido, fertilizanteLiquido, fertilizanteBovino, "Não necessita muito", "Busque por adubos que possuam nitrogênio, fósforo e potássio é uma boa pedida. São elementos que complementam o cultivo e mantém a vitalidade da planta!", "A adubagem da samambaia deve ser feito 6 meses após o plantio, durante a primavera e outono, pois é quando sua fase de crescimento está ativa."));
    static ArrayList<String> listaCuidadosExtras = new ArrayList<String>(Arrays.asList("Os antúrios podem sofrer com pragas, as mais comuns são pulgões, ácaros, cochonilhas, lesmas, caracóis e lagartas.\n" +
            "A maior parte dessas pragas podem ser combatidas com receitas caseiras.", plantaVenenosa, cuidadosSem, plantaVenenosa, cuidadosSem, plantaVenenosa, "Não precisa de muita água", "Em alguns casos, a samambaia poderá crescer mais do que o vaso é capaz de suportar.\n" +
            "Nestes casos, poderá ser necessário dividir a samambaia em outros vasos."));


    //Get cardview
    public ArrayList<String> getNomeDasPlantas() {return nomeDasPlantas;}
    public ArrayList<String> getEspeciesDasPlantas() {return especiesDasPlantas;}
    public ArrayList<String> getTxtAgua() {return txtAgua;}
    public ArrayList<String> getTxtLuz() {return txtLuz;}
    public ArrayList<String> getTxtAmbiente() {return txtAmbiente;}
    //getimagem
    public ArrayList<Integer> getImagemPlanta() {return imagemPlanta;}
    public ArrayList<Integer> getImagemLuz() {return imagemLuz;}




}
