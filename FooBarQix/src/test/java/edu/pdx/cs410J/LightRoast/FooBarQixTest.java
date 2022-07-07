package edu.pdx.cs410J.LightRoast;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FooBarQixTest
{

  private FooBarQix fooBarQix;

  @Test
  void canInstantiateKataClass() {
    new FooBarQix();
  }

  @BeforeEach
  void setup() {
    fooBarQix = new FooBarQix();
  }
  
  @Test
  void compute1Returns1() {
    assertThat(fooBarQix.compute("1"), equalTo("1"));
  }

  @Test
  void compute3ReturnsFooFoo() {
    assertThat(fooBarQix.compute("3"), equalTo("FooFoo"));
  }

  @Test
  void compute5ReturnsBarBar() {
    assertThat(fooBarQix.compute("5"), equalTo("BarBar"));
  }

  @Test
  void compute7ReturnsQixQix() {
    assertThat(fooBarQix.compute("7"), equalTo("QixQix"));
  }

  @Test
  void compute105ReturnsFooBarQixBar() {
    assertThat(fooBarQix.compute("105"), equalTo("FooBarQix*Bar"));
  }

  @Test
  void compute353ReturnsFooBarFoo() {
    assertThat(fooBarQix.compute("353"), equalTo("FooBarFoo"));
  }

  @Test
  void compute15ReturnsFooBarBar() {
    assertThat(fooBarQix.compute("15"), equalTo("FooBarBar"));
  }

  @Test
  void compute101Returns1Star1(){
    assertThat(fooBarQix.compute("101"), equalTo("1*1"));
  }

  @Test
  void compute33ReturnsFooFooFoo() {
    assertThat(fooBarQix.compute("33"), equalTo("FooFooFoo"));
  }

}
