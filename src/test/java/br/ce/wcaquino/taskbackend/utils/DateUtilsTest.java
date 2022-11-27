package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void shouldReturnTrueForFutureDate() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		boolean dateResult = DateUtils.isEqualOrFutureDate(date);
		Assert.assertTrue(dateResult);
	}
	
	@Test
	public void shouldReturnFalseForPastDate() {
		LocalDate date = LocalDate.of(2010, 01, 01);
		boolean dateResult = DateUtils.isEqualOrFutureDate(date);
		Assert.assertFalse(dateResult);
	}
	
	@Test
	public void shouldReturnTrueForActualDate() {
		LocalDate date = LocalDate.now();
		boolean dateResult = DateUtils.isEqualOrFutureDate(date);
		Assert.assertTrue(dateResult);
	}
}
