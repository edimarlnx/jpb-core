/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jpb.enums;

import br.com.jpb.util.MessageUtil;

import java.util.stream.Stream;

/**
 * @author "<a href='jpbassinello@gmail.com'>João Paulo Bassinello</a>"
 */
public enum Gender {

	MALE("male"), FEMALE("female"), UNKNOWN("unknown");

	private final String value;

	private Gender(String value) {
		this.value = value;
	}

	public static Gender getByValue(final String value) {
		return Stream.of(values()).filter(g -> g.value.equals(value)).findFirst().orElse(null);
	}

	public String getPtBr() {
		return MessageUtil.getString(value);
	}
}
