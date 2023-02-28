class Document {

}

interface Machine {

    void print(Document d);
    void fax(Document d) throws Exception;
    void scan(Document d) throws Exception;
}

interface Printer {
    void print(Document d);
    }

interface Scanner {
    void scan(Document d);
}

interface Fax {
    void fax(Document d);
}

class MultiFunctionPrinter implements Printer, Scanner, Fax {

    @Override
    public void print(Document d) {

    }
    @Override
    public void fax(Document d) {

    }
    @Override
    public void scan(Document d) {
        
    }
}

class OldSchoolPrinter implements Printer {

    @Override
    public void print(Document d) {

    }

    // @Override
    // public void fax(Document d) {
    //     throw new NotImplementedException();   ยังไม่เปิดใช้งาน
    // }

    // @Override
    // public void scan(Document d) {
    //     throw new NotImplementedException();   ยังไม่เปิดใช้งาน
    // }
}

class JustAPrinter implements Printer {
    @Override
    public void print(Document d) {

    }
}

class Photocopier implements Printer, Scanner {
    
    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}

public class SOLID_I {
    
}
