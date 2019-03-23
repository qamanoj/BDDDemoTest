package com.mystepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefinition1 {

	
	@Before(order=0)
	public void setup()
	{
		System.out.println("setup");
	}
	
	@After(order=1)
	public void testdemo()
	{
		System.out.println("testdemo");
	}
	
	@Before(order=0)
	public void setup1()
	{
		System.out.println("setup1");
	}
	
	@After(order=1)
	public void testdemo1()
	{
		System.out.println("testdemo1");
	}
	
	@Given("^this is verify site link$")
	public void this_is_verify_site_link()  {

		System.out.println("site");
	}

	@Given("^this is verify title link$")
	public void this_is_verify_title_link()  {

		System.out.println("title");
	}

	@Given("^this is verify homepage link$")
	public void this_is_verify_homepage_link() {

		System.out.println("homepage");
	}

	@Given("^this is verify username link$")
	public void this_is_verify_username_link()  {

		System.out.println("username");
	}

	@Given("^this is verify password link$")
	public void this_is_verify_password_link()  {

		System.out.println("password");
	}

	@Given("^this is verify login link$")
	public void this_is_verify_login_link()  {

		System.out.println("login");
	}

	@Given("^this is verify branch link$")
	public void this_is_verify_branch_link()  {

		System.out.println("branch");
	}

	@Given("^this is verify roles link$")
	public void this_is_verify_roles_link() {

		System.out.println("roles");
	}

	@Given("^this is verify employee link$")
	public void this_is_verify_employee_link()  {

		System.out.println("employee");
	}

	@Given("^this is verify users link$")
	public void this_is_verify_users_link()  {

		System.out.println("users");
	}

	@Given("^this is verify customer page link$")
	public void this_is_verify_customer_page_link()  {

		System.out.println("customer");
	}

	@Given("^this is verify contact link$")
	public void this_is_verify_contact_link()  {

		System.out.println("contact");
	}

	@Given("^this is verify deals link$")
	public void this_is_verify_deals_link()  {

		System.out.println("deals");
	}

	@Given("^this is verify table link$")
	public void this_is_verify_table_link()  {

		System.out.println("table");
	}

	@Given("^this is verify created newpage link$")
	public void this_is_verify_created_newpage_link() {

		System.out.println("created newpage");
	}

	@Given("^this is verify delete link$")
	public void this_is_verify_delete_link()  {

		System.out.println("delete");
	}

	@Given("^this is verify sinup link$")
	public void this_is_verify_sinup_link() {

		System.out.println("sinup");
	}

	@Given("^this is verify task link$")
	public void this_is_verify_task_link()  {

		System.out.println("task");
	}

	@Given("^this is verify work page link$")
	public void this_is_verify_work_page_link()  {

		System.out.println("work");
	}
	
	@Given("^this is verify logpout link$")
	public void this_is_verify_logout_link()
	{
		System.out.println("logout");
	}
}
