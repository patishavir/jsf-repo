/*     */
package org.primefaces.showcase.domain;

/*     */
/*     */ import java.io.Serializable;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ public class User/*     */ implements Serializable
/*     */ {
	/*     */ private String firstname;
	/*     */ private String lastname;
	/*     */ private Integer age;
	/*     */ private String street;
	/*     */ private String city;
	/*     */ private String postalCode;
	/*     */ private String info;
	/*     */ private String email;
	/*     */ private String phone;

	/*     */
	/*     */ public String getFirstname() {
		/* 41 */ return this.firstname;
		/*     */ }

	/*     */
	/*     */ public void setFirstname(String firstname) {
		/* 45 */ this.firstname = firstname;
		/*     */ }

	/*     */
	/*     */ public String getLastname() {
		/* 49 */ return this.lastname;
		/*     */ }

	/*     */
	/*     */ public void setLastname(String lastname) {
		/* 53 */ this.lastname = lastname;
		/*     */ }

	/*     */
	/*     */ public Integer getAge() {
		/* 57 */ return this.age;
		/*     */ }

	/*     */
	/*     */ public void setAge(Integer age) {
		/* 61 */ this.age = age;
		/*     */ }

	/*     */
	/*     */ public String getStreet() {
		/* 65 */ return this.street;
		/*     */ }

	/*     */
	/*     */ public void setStreet(String street) {
		/* 69 */ this.street = street;
		/*     */ }

	/*     */
	/*     */ public String getCity() {
		/* 73 */ return this.city;
		/*     */ }

	/*     */
	/*     */ public void setCity(String city) {
		/* 77 */ this.city = city;
		/*     */ }

	/*     */
	/*     */ public String getPostalCode() {
		/* 81 */ return this.postalCode;
		/*     */ }

	/*     */
	/*     */ public void setPostalCode(String postalCode) {
		/* 85 */ this.postalCode = postalCode;
		/*     */ }

	/*     */
	/*     */ public String getInfo() {
		/* 89 */ return this.info;
		/*     */ }

	/*     */
	/*     */ public void setInfo(String info) {
		/* 93 */ this.info = info;
		/*     */ }

	/*     */
	/*     */ public String getEmail() {
		/* 97 */ return this.email;
		/*     */ }

	/*     */
	/*     */ public void setEmail(String email) {
		/* 101 */ this.email = email;
		/*     */ }

	/*     */
	/*     */ public String getPhone() {
		/* 105 */ return this.phone;
		/*     */ }

	/*     */
	/*     */ public void setPhone(String phone) {
		/* 109 */ this.phone = phone;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * domain\User.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */