package javaEX;

class Emp {
    int empno;
    String ename;
    int deptno;

    public Emp(int empno, String ename, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", deptno=" + deptno +
                '}';
    }
}