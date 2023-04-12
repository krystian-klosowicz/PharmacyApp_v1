package DAO;
import entity.Faktury;

import java.util.List;

public interface FakturaDAO {

    public void dodajFakture(Faktury faktura);
    public List<Faktury> listaFaktury();
    public List<Faktury> wyszukajFaktury(String id_faktury, String id_klienta);
    public void usunFakture(Integer id);
    public void zaktualizujFakture(Faktury faktura);

}
