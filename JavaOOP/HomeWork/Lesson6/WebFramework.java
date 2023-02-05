public class WebFramework {
    public void save(IForm frm) {
        ISQL db = new MySQL();
        ISQL anyDB = new AnySQL();
        db.save(frm);
        anyDB.save(frm);
    }
}
