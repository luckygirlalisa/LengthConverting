import com.thoughtworks.Length;
import com.thoughtworks.Type;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthPlusTest {
    @Test
    public void oneMilePlusTwoMileShouldBeThreeMile() {
        Length oneMile = Length.createLength(Type.MILE, 1);
        Length twoMile = Length.createLength(Type.MILE, 2);
        Length threeMile = Length.createLength(Type.MILE, 3);
        assertThat(oneMile.plus(twoMile), is(threeMile));
    }
    @Test
    public void oneYardPlusTwoYardShouldBeThreeYard() {
        Length oneYard = Length.createLength(Type.YARD, 1);
        Length twoYard = Length.createLength(Type.YARD, 2);
        Length threeYard = Length.createLength(Type.YARD, 3);
        assertThat(oneYard.plus(twoYard), is(threeYard));
    }
    @Test
    public void oneFeetPlusTwoFeetShouldBeThreeFeet() {
        Length oneFeet = Length.createLength(Type.FEET, 1);
        Length twoFeet = Length.createLength(Type.FEET, 2);
        Length threeFeet = Length.createLength(Type.FEET, 3);
        assertThat(oneFeet.plus(twoFeet), is(threeFeet));
    }
    @Test
    public void oneInchPlusTwoInchShouldBeThreeInch() {
        Length oneInch = Length.createLength(Type.INCH, 1);
        Length twoInch = Length.createLength(Type.INCH, 2);
        Length threeInch = Length.createLength(Type.INCH,3);
        assertThat(oneInch.plus(twoInch), is(threeInch));
    }

    @Test
    public void oneMilePlusOneYardShouldBe1761Yard() {
        Length oneMile = Length.createLength(Type.MILE, 1);
        Length oneYard = Length.createLength(Type.YARD, 1);
        Length _1761Yard = Length.createLength(Type.YARD, 1761);
        assertThat(oneMile.plus(oneYard), is(_1761Yard));
        assertThat(oneYard.plus(oneMile), is(_1761Yard));
    }
    @Test
    public void oneYardPlusOneFeetShouldBeFourFeet() {
        Length oneYard = Length.createLength(Type.YARD, 1);
        Length oneFeet = Length.createLength(Type.FEET, 1);
        Length fourFeet = Length.createLength(Type.FEET, 4);
        assertThat(oneYard.plus(oneFeet), is(fourFeet));
        assertThat(oneFeet.plus(oneYard), is(fourFeet));
    }
    @Test
    public void oneFeetPlusOneInchShouldBeThirteenInch() {
        Length oneFeet = Length.createLength(Type.FEET, 1);
        Length oneInch = Length.createLength(Type.INCH, 1);
        Length thirteenInch = Length.createLength(Type.INCH, 13);
        assertThat(oneFeet.plus(oneInch), is(thirteenInch));
        assertThat(oneInch.plus(oneFeet), is(thirteenInch));
    }

}
