import com.thoughtworks.Length;
import com.thoughtworks.Type;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class LengthEqualsTest {
    @Test
    public void oneMileShouldEqualOneMile() {
        Length oneMile = Length.createLength(Type.MILE, 1);
        Length anotherOneMile = Length.createLength(Type.MILE, 1);
        assertThat(oneMile, is(anotherOneMile));
    }
    @Test
    public void oneMileShouldNotEqualTwoMile() {
        Length oneMile = Length.createLength(Type.MILE, 1);
        Length twoMile = Length.createLength(Type.MILE, 2);
        assertThat(oneMile, not(twoMile));
    }

    @Test
    public void oneYardShouldEqualOneYard() {
        Length oneYard = Length.createLength(Type.YARD, 1);
        Length anotherOneYard = Length.createLength(Type.YARD, 1);
        assertThat(oneYard, is(anotherOneYard));
    }
    @Test
    public void oneYardShouldNotEqualTwoYard() {
        Length oneYard = Length.createLength(Type.YARD, 1);
        Length twoYard = Length.createLength(Type.YARD, 2);
        assertThat(oneYard, not(twoYard));
    }

    @Test
    public void oneFeetShouldEqualOneFeet() {
        Length oneFeet = Length.createLength(Type.FEET, 1);
        Length anotherOneFeet = Length.createLength(Type.FEET, 1);
        assertThat(oneFeet, is(anotherOneFeet));
    }
    @Test
    public void oneFeetShouldNotEqualTwoFeet() {
        Length oneFeet = Length.createLength(Type.FEET, 1);
        Length twoFeet = Length.createLength(Type.FEET, 2);
        assertThat(oneFeet, not(twoFeet));
    }

    @Test
    public void oneInchShouldEqualOneInch() {
        Length oneInch = Length.createLength(Type.INCH, 1);
        Length anotherOneInch = Length.createLength(Type.INCH, 1);
        assertThat(oneInch, is(anotherOneInch));
    }
    @Test
    public void oneInchShouldNotEqualTwoInch() {
        Length oneInch = Length.createLength(Type.INCH, 1);
        Length twoInch = Length.createLength(Type.INCH, 2);
        assertThat(oneInch, not(twoInch));
    }

    @Test
    public void oneMileAnd1760YardShouldEqual() {
        Length oneMile = Length.createLength(Type.MILE, 1);
        Length _1760Yard = Length.createLength(Type.YARD, 1760);
        assertThat(oneMile, is(_1760Yard));
        assertThat(_1760Yard, is(oneMile));
    }
    @Test
    public void oneMileAnd1761YardShouldNotEqual() {
        Length oneMile = Length.createLength(Type.MILE, 1);
        Length _1761Yard = Length.createLength(Type.YARD, 1761);
        assertThat(oneMile, not(_1761Yard));
        assertThat(_1761Yard, not(oneMile));
    }

    @Test
    public void oneYardAndThreeFeetShouldEqual() {
        Length oneYard = Length.createLength(Type.YARD, 1);
        Length threeFeet = Length.createLength(Type.FEET, 3);
        assertThat(oneYard, is(threeFeet));
        assertThat(threeFeet, is(oneYard));
    }
    @Test
    public void oneYardAndFourFeetShouldNotEqual() {
        Length oneYard = Length.createLength(Type.YARD, 1);
        Length fourFeet = Length.createLength(Type.FEET, 4);
        assertThat(oneYard, not(fourFeet));
        assertThat(fourFeet, not(oneYard));
    }

    @Test
    public void oneFeetAndTwelveInchShouldEqual() {
        Length oneFeet = Length.createLength(Type.FEET, 1);
        Length twelveInch = Length.createLength(Type.INCH, 12);
        assertThat(oneFeet, is(twelveInch));
        assertThat(twelveInch, is(oneFeet));
    }
    @Test
    public void oneFeetAndThirteenInchShouldNotEqual() {
        Length oneFeet = Length.createLength(Type.FEET, 1);
        Length thirteenInch = Length.createLength(Type.INCH, 13);
        assertThat(oneFeet, not(thirteenInch));
        assertThat(thirteenInch, not(oneFeet));
    }


}
