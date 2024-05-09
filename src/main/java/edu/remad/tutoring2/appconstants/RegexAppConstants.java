package edu.remad.tutoring2.appconstants;

public final class RegexAppConstants {

	public static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
			+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	public static final String PASSWORD_REGEX = "[0-9a-zA-Z]*";
	public static final String USERNAME_REGEX = "[0-9a-zA-Z]*";
	public static final String HOUSE_NUMBER_REGEX = "[0-9A-Z]*";
	public static final String STREET_REGEX = "[a-zA-Z -]*";
	public static final String ZIP_REGEX = "[0-9]*";
	public static final String ZIP_LOCATION_REGEX = "[a-zA-Z -.]*";
	public static final String FIRST_NAME_REGEX = "[1-9a-zA-Z -.]*";
	public static final String LAST_NAME_REGEX = "[1-9a-zA-Z -.]*";
	public static final String GENDER_REGEX = "[A-Za-z]*";
	public static final String CELL_PHONE_REGEX = "[0-9+-]*";

	private RegexAppConstants() {
		throw new UnsupportedOperationException(this.getClass().getName() + " shall not be supported.");
	}
}
