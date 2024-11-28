public class MoneyCalculator {

    private static final int BANKNOTES_PER_PACK = 100;
    private static final int PACKS_IN_CASSETTE = 20;

    public int calculateCassetteCount(int banknoteCount) {

        int banknotePack = banknoteCount / BANKNOTES_PER_PACK + (banknoteCount % BANKNOTES_PER_PACK == 0 ? 0 :1);

        int banknoteCassette = banknotePack / PACKS_IN_CASSETTE + (banknotePack % PACKS_IN_CASSETTE == 0 ? 0 : 1);
        return banknoteCassette;
    }
}
