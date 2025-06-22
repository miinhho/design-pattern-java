package io.github.miinhho.adapter;

import io.github.miinhho.adapter.adapters.SquarePegAdapter;
import io.github.miinhho.adapter.round.RoundHole;
import io.github.miinhho.adapter.round.RoundPeg;
import io.github.miinhho.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        var hole = new RoundHole(5);
        var rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        var smallSqPeg = new SquarePeg(2);
        var largeSqPeg = new SquarePeg(20);

        var smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        var largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
