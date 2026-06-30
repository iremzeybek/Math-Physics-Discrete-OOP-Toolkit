
public class Main {

    // ===================== BASE CLASS =====================
    static abstract class Solution {
        abstract String title();
        abstract void steps();
        abstract String answer();
    }

    // ======================================================
    // ===================== CALCULUS =======================
    // ======================================================

    static class Calc1 extends Solution { public String title(){return "Calc 1: Integration by Parts";}
        public void steps(){System.out.println("∫ x ln(x) dx");}
        public String answer(){return "(x^2/2)ln(x)-(x^2/4)+C";}}

    static class Calc2 extends Solution { public String title(){return "Calc 2: Trig Substitution";}
        public void steps(){System.out.println("∫ 1/(x^2+9) dx");}
        public String answer(){return "(1/3)arctan(x/3)+C";}}

    static class Calc3 extends Solution { public String title(){return "Calc 3: Partial Fractions";}
        public void steps(){System.out.println("∫ (3x+5)/((x+1)(x+2)) dx");}
        public String answer(){return "2ln|x+1|+ln|x+2|+C";}}

    static class Calc4 extends Solution { public String title(){return "Calc 4: Improper Integral";}
        public void steps(){System.out.println("∫ 1/x^2 dx 1→∞");}
        public String answer(){return "1";}}

    static class Calc5 extends Solution { public String title(){return "Calc 5: Area Between Curves";}
        public void steps(){System.out.println("y=x and y=x^2");}
        public String answer(){return "1/6";}}

    static class Calc6 extends Solution { public String title(){return "Calc 6: Disk Method";}
        public void steps(){System.out.println("V=π∫x^2dx");}
        public String answer(){return "8π/3";}}

    static class Calc7 extends Solution { public String title(){return "Calc 7: Shell Method";}
        public void steps(){System.out.println("V=2π∫x·x dx");}
        public String answer(){return "16π/3";}}

    static class Calc8 extends Solution { public String title(){return "Calc 8: Arc Length";}
        public void steps(){System.out.println("L=∫√(1+(dy/dx)^2)dx");}
        public String answer(){return "2√2";}}

    static class Calc9 extends Solution { public String title(){return "Calc 9: Surface Area";}
        public void steps(){System.out.println("S=2π∫x√(1+(dy/dx)^2)dx");}
        public String answer(){return "4π√2";}}

    static class Calc10 extends Solution { public String title(){return "Calc 10: Geometric Series";}
        public void steps(){System.out.println("S=a/(1-r)");}
        public String answer(){return "1/3";}}

    static class Calc11 extends Solution { public String title(){return "Calc 11: Convergence";}
        public void steps(){System.out.println("Σ 1/n^2");}
        public String answer(){return "Converges";}}

    static class Calc12 extends Solution { public String title(){return "Calc 12: Integral Test";}
        public void steps(){System.out.println("Σ 1/n^3");}
        public String answer(){return "Converges";}}

    static class Calc13 extends Solution { public String title(){return "Calc 13: Power Series";}
        public void steps(){System.out.println("Σ x^n/n!");}
        public String answer(){return "R=∞";}}

    static class Calc14 extends Solution { public String title(){return "Calc 14: Taylor Series";}
        public void steps(){System.out.println("e^x expansion");}
        public String answer(){return "1+x+x^2/2!+...";}}

    static class Calc15 extends Solution { public String title(){return "Calc 15: Polar Area";}
        public void steps(){System.out.println("A=1/2∫r^2 dθ");}
        public String answer(){return "π";}}

    // ======================================================
    // ===================== PHYSICS ========================
    // ======================================================

    static class Phys1 extends Solution { public String title(){return "Phys 1: Coulomb Law";}
        public void steps(){System.out.println("F=kq1q2/r^2");}
        public String answer(){return "0.216 N";}}

    static class Phys2 extends Solution { public String title(){return "Phys 2: Electric Field";}
        public void steps(){System.out.println("E=kq/r^2");}
        public String answer(){return "7.19e4 N/C";}}

    static class Phys3 extends Solution { public String title(){return "Phys 3: Gauss Law";}
        public void steps(){System.out.println("Φ=Q/ε0");}
        public String answer(){return "8.99e5 N/C";}}

    static class Phys4 extends Solution { public String title(){return "Phys 4: Electric Potential";}
        public void steps(){System.out.println("V=kQ/r");}
        public String answer(){return "5.39e4 V";}}

    static class Phys5 extends Solution { public String title(){return "Phys 5: Capacitance";}
        public void steps(){System.out.println("C=ε0A/d");}
        public String answer(){return "1.77e-10 F";}}

    static class Phys6 extends Solution { public String title(){return "Phys 6: Ohm Law";}
        public void steps(){System.out.println("V=IR");}
        public String answer(){return "3 A";}}

    static class Phys7 extends Solution { public String title(){return "Phys 7: Kirchhoff";}
        public void steps(){System.out.println("Loop rules");}
        public String answer(){return "2 A";}}

    static class Phys8 extends Solution { public String title(){return "Phys 8: Magnetic Force";}
        public void steps(){System.out.println("F=qvB");}
        public String answer(){return "1.6e-13 N";}}

    static class Phys9 extends Solution { public String title(){return "Phys 9: Ampere Law";}
        public void steps(){System.out.println("B=μ0I/2πr");}
        public String answer(){return "5e-5 T";}}

    static class Phys10 extends Solution { public String title(){return "Phys 10: Magnetic Flux";}
        public void steps(){System.out.println("Φ=BAcosθ");}
        public String answer(){return "0.05 Wb";}}

    static class Phys11 extends Solution { public String title(){return "Phys 11: Faraday";}
        public void steps(){System.out.println("ε=-ΔΦ/Δt");}
        public String answer(){return "2 V";}}

    static class Phys12 extends Solution { public String title(){return "Phys 12: Inductance";}
        public void steps(){System.out.println("ε=-LΔI/Δt");}
        public String answer(){return "12 V";}}

    static class Phys13 extends Solution { public String title(){return "Phys 13: Refraction";}
        public void steps(){System.out.println("Snell law");}
        public String answer(){return "22°";}}

    static class Phys14 extends Solution { public String title(){return "Phys 14: Lens";}
        public void steps(){System.out.println("1/f=1/do+1/di");}
        public String answer(){return "30 cm";}}

    static class Phys15 extends Solution { public String title(){return "Phys 15: Interference";}
        public void steps(){System.out.println("d sinθ = mλ");}
        public String answer(){return "5e-4 m";}}

    // ======================================================
    // ===================== DISCRETE =======================
    // ======================================================

    static class Dis1 extends Solution {
        public String title(){return "Discrete 1: Logic";}
        public void steps(){System.out.println("p→q");}
        public String answer(){return "False case identified";}
    }

    static class Dis2 extends Solution {
        public String title(){return "Discrete 2: Proof";}
        public void steps(){System.out.println("Induction proof");}
        public String answer(){return "Proved";}
    }

    static class Dis3 extends Solution {
        public String title(){return "Discrete 3: Sets";}
        public void steps(){System.out.println("Union/Intersection");}
        public String answer(){return "Computed";}
    }

    static class Dis4 extends Solution {
        public String title(){return "Discrete 4: Combinatorics";}
        public void steps(){System.out.println("C(n,r)");}
        public String answer(){return "10 ways";}
    }

    static class Dis5 extends Solution {
        public String title(){return "Discrete 5: Pigeonhole";}
        public void steps(){System.out.println("13 students 12 months");}
        public String answer(){return "At least one shared";}
    }

    static class Dis6 extends Solution {
        public String title(){return "Discrete 6: Relations";}
        public void steps(){System.out.println("Reflexive check");}
        public String answer(){return "Equivalence relation";}
    }

    static class Dis7 extends Solution {
        public String title(){return "Discrete 7: Graphs";}
        public void steps(){System.out.println("Vertices and edges");}
        public String answer(){return "Connected graph";}
    }

    static class Dis8 extends Solution {
        public String title(){return "Discrete 8: Trees";}
        public void steps(){System.out.println("V-1 edges");}
        public String answer(){return "No cycles";}
    }

    static class Dis9 extends Solution {
        public String title(){return "Discrete 9: Modular Arithmetic";}
        public void steps(){System.out.println("17 mod 5");}
        public String answer(){return "2";}
    }

    static class Dis10 extends Solution {
        public String title(){return "Discrete 10: Recurrence";}
        public void steps(){System.out.println("a_n=a_{n-1}+2");}
        public String answer(){return "3,5,7,9,11";}
    }

    // ======================================================
    // ===================== MAIN ============================
    // ======================================================

    public static void main(String[] args) {

        Solution[] all = {

                new Calc1(), new Calc2(), new Calc3(), new Calc4(), new Calc5(),
                new Calc6(), new Calc7(), new Calc8(), new Calc9(), new Calc10(),
                new Calc11(), new Calc12(), new Calc13(), new Calc14(), new Calc15(),

                new Phys1(), new Phys2(), new Phys3(), new Phys4(), new Phys5(),
                new Phys6(), new Phys7(), new Phys8(), new Phys9(), new Phys10(),
                new Phys11(), new Phys12(), new Phys13(), new Phys14(), new Phys15(),

                new Dis1(), new Dis2(), new Dis3(), new Dis4(), new Dis5(),
                new Dis6(), new Dis7(), new Dis8(), new Dis9(), new Dis10()
        };

        for (Solution s : all) {
            System.out.println("==================================");
            System.out.println(s.title());
            s.steps();
            System.out.println("Answer: " + s.answer());
            System.out.println();
        }
    }
}
