public class Kitap {

    private int id;

    private int sayfaSayisi;

    private String adi;

    private String yazarAdi;

    private double fiyati;

    public static final class KitapBuilder {
        private int id;
        private int sayfaSayisi;
        private String adi;
        private String yazarAdi;
        private double fiyati;

        private KitapBuilder() {
        }

        public static KitapBuilder aKitap() {
            return new KitapBuilder();
        }

        public KitapBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public KitapBuilder withSayfaSayisi(int sayfaSayisi) {
            this.sayfaSayisi = sayfaSayisi;
            return this;
        }

        public KitapBuilder withAdi(String adi) {
            this.adi = adi;
            return this;
        }

        public KitapBuilder withYazarAdi(String yazarAdi) {
            this.yazarAdi = yazarAdi;
            return this;
        }

        public KitapBuilder withFiyati(double fiyati) {
            this.fiyati = fiyati;
            return this;
        }

        public Kitap build() {
            Kitap kitap = new Kitap();
            kitap.yazarAdi = this.yazarAdi;
            kitap.fiyati = this.fiyati;
            kitap.adi = this.adi;
            kitap.sayfaSayisi = this.sayfaSayisi;
            kitap.id = this.id;
            return kitap;
        }
    }

    @Override
    public String toString() {
        return "KitapBuilder{" +
                "id=" + id +
                ", sayfaSayisi=" + sayfaSayisi +
                ", adi='" + adi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", fiyati=" + fiyati +
                '}';
    }
}
