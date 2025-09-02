package atividadepoo4;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Ingresso> ingressos = new ArrayList<>();

        IngressoVip vip = new IngressoVip("Área Premium", 200.0);
        vip.setLocal("Arena");
        vip.setData("01/10/2025");
        vip.setLote(1);

        IngressoEstudante estudante = new IngressoEstudante("Universidade XYZ", 200.0);
        estudante.setLocal("Arena");
        estudante.setData("01/10/2025");
        estudante.setLote(2);

        IngressoCortesia cortesia = new IngressoCortesia("Empresa ABC", 200.0);
        cortesia.setLocal("Arena");
        cortesia.setData("01/10/2025");
        cortesia.setLote(3);

        ingressos.add(vip);
        ingressos.add(estudante);
        ingressos.add(cortesia);

        for (Ingresso ingresso : ingressos) {
            System.out.println(ingresso.toString());
            System.out.println("--------------------------");
        }
    }
}
