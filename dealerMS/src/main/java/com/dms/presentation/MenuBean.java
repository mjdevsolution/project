/**
 * 
 */
package com.dms.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuItem;
import org.primefaces.model.menu.MenuModel;
import org.springframework.stereotype.Component;

/**
 * @author Jeyakaran
 * 
 */
@Component
@ManagedBean
@SessionScoped
public class MenuBean implements Serializable {

	private MenuModel mainMenuModel;
	private MenuModel subMenuModel;

	public MenuBean() {
		mainMenuModel = new DefaultMenuModel();

		DefaultMenuItem menu1 = new DefaultMenuItem("Home");
		menu1.setId("menu1");
		menu1.setCommand("#{menuBean.selectSubMenu}");
		menu1.setParam("option", "menu1");
		menu1.setAjax(false);

		DefaultMenuItem menu2 = new DefaultMenuItem("Dealer Management");
		menu2.setId("menu2");
		menu2.setCommand("#{menuBean.selectSubMenu}");
		menu2.setParam("option", "menu2");
		menu2.setAjax(false);

		DefaultMenuItem menu3 = new DefaultMenuItem("Stock Request");
		menu3.setId("menu3");
		menu3.setCommand("#{menuBean.selectSubMenu}");
		menu3.setParam("option", "menu3");
		menu3.setAjax(false);

		DefaultMenuItem menu4 = new DefaultMenuItem("Reports");
		menu4.setId("menu4");
		menu4.setCommand("#{menuBean.selectSubMenu}");
		menu4.setParam("option", "menu4");
		menu4.setAjax(false);

		mainMenuModel.addElement(menu1);
		mainMenuModel.addElement(menu2);
		mainMenuModel.addElement(menu3);
		mainMenuModel.addElement(menu4);

		// // Second submenu
		// DefaultSubMenu secondSubmenu = new DefaultSubMenu("Dynamic Actions");
		//
		//
		// item = new DefaultMenuItem("Delete");
		// item.setIcon("ui-icon-close");
		// item.setCommand("#{menuBean.delete}");
		// item.setAjax(false);
		// secondSubmenu.addElement(item);

	}

	public String selectSubMenu(ActionEvent event) {
		MenuItem menuItem = ((MenuActionEvent) event).getMenuItem();
		String option = menuItem.getParams().get("option").get(0);
		populateSubMenuModel(option);
		return "";
	}

	public void populateSubMenuModel(String option) {

		subMenuModel = new DefaultMenuModel();

		if ("menu1".equals(option)) {
			DefaultMenuItem menu1 = new DefaultMenuItem("Home");
			menu1.setId("smenu1");
			menu1.setCommand("#");
			menu1.setAjax(false);

			DefaultMenuItem menu2 = new DefaultMenuItem("Dashboard");
			menu1.setId("smenu2");
			menu1.setCommand("#");
			menu1.setAjax(false);

			DefaultMenuItem menu3 = new DefaultMenuItem("Chat with Us");
			menu1.setId("smenu3");
			menu1.setCommand("#");
			menu1.setAjax(false);

			DefaultMenuItem menu4 = new DefaultMenuItem("About Us");
			menu1.setId("smenu4");
			menu1.setCommand("#");
			menu1.setAjax(false);

			DefaultMenuItem menu5 = new DefaultMenuItem("Contact Us");
			menu1.setId("smenu5");
			menu1.setCommand("#");
			menu1.setAjax(false);

			subMenuModel.addElement(menu1);
			subMenuModel.addElement(menu2);
			subMenuModel.addElement(menu3);
			subMenuModel.addElement(menu4);
			subMenuModel.addElement(menu5);

		} else {

		}

	}

	public MenuModel getMainMenuModel() {
		return mainMenuModel;
	}

	public MenuModel getSubMenuModel() {
		return subMenuModel;
	}

}