package edu.pdx.cs410J.Calculator;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void twoNumbersAdd() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2","2","+");
    assertThat(result.getTextWrittenToStandardOut(), containsString("4"));
  }

  @Test
  void InvalidInput(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "!","2","+");
    assertThat(result.getTextWrittenToStandardError(), containsString("Invalid operator"));

  }

  @Test
  void InvalidInputExtraNumbers(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2","2","2");
    assertThat(result.getTextWrittenToStandardError(), containsString("Not enough operands for numbers"));
  }

  @Test
  void oneNumberOneOperator(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2","+");
    assertThat(result.getTextWrittenToStandardError(), containsString("Not enough numbers for operation"));

  }

  @Test
  void twoNumberMultiply() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2", "3", "*");
    assertThat(result.getTextWrittenToStandardOut(), containsString("6"));
  }

  @Test
  void twoNumberDivide() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "4", "2", "/");
    assertThat(result.getTextWrittenToStandardOut(), containsString("2"));
  }

  @Test
  void twoNumberSubtract() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "4", "2", "-");
    assertThat(result.getTextWrittenToStandardOut(), containsString("2"));
  }

  @Test
  void bigNumberTest() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "3", "5", "8", "*", "7", "+", "*");
    assertThat(result.getTextWrittenToStandardOut(), containsString("141"));
  }

  @Test
  void twoNumberSqrt() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "4", "sqrt");
    assertThat(result.getTextWrittenToStandardOut(), containsString("2"));
  }

  @Test
  void oddNumberSqrt() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "5", "sqrt");
    assertThat(result.getTextWrittenToStandardOut(), containsString("2"));
  }

}
