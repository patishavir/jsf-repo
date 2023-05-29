/*    */
package org.primefaces.showcase.view.panel;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.model.DefaultTreeNode;
/*    */ import org.primefaces.model.TreeNode;
/*    */ import org.primefaces.showcase.domain.Mail;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ @ManagedBean
/*    */ @ViewScoped
/*    */ public class MailboxView/*    */ implements Serializable
/*    */ {
	/*    */ private TreeNode mailboxes;
	/*    */ private List<Mail> mails;
	/*    */ private Mail mail;
	/*    */ private TreeNode mailbox;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 45 */ this.mailboxes = (TreeNode) new DefaultTreeNode("root", null);
		/*    */
		/* 47 */ DefaultTreeNode defaultTreeNode1 = new DefaultTreeNode("i", "Inbox", this.mailboxes);
		/* 48 */ DefaultTreeNode defaultTreeNode2 = new DefaultTreeNode("s", "Sent", this.mailboxes);
		/* 49 */ DefaultTreeNode defaultTreeNode3 = new DefaultTreeNode("t", "Trash", this.mailboxes);
		/* 50 */ DefaultTreeNode defaultTreeNode4 = new DefaultTreeNode("j", "Junk", this.mailboxes);
		/*    */
		/* 52 */ DefaultTreeNode defaultTreeNode5 = new DefaultTreeNode("Gmail", (TreeNode) defaultTreeNode1);
		/* 53 */ DefaultTreeNode defaultTreeNode6 = new DefaultTreeNode("Hotmail", (TreeNode) defaultTreeNode1);
		/*    */
		/* 55 */ this.mails = new ArrayList<Mail>();
		/* 56 */ this.mails
				.add(new Mail("optimus@primefaces.com", "Team Meeting", "Meeting to discuss roadmap", new Date()));
		/* 57 */ this.mails.add(new Mail("spammer@spammer.com", "You've won Lottery",
				"Send me your credit card info to claim", new Date()));
		/* 58 */ this.mails
				.add(new Mail("spammer@spammer.com", "Your email has won", "Click the exe file to claim", new Date()));
		/* 59 */ this.mails.add(new Mail("primefaces-commits", "[primefaces] r4491 - Layout mailbox sample",
				"Revision:4490 Author:cagatay.civici", new Date()));
		/*    */ }

	/*    */
	/*    */ public TreeNode getMailboxes() {
		/* 63 */ return this.mailboxes;
		/*    */ }

	/*    */
	/*    */ public List<Mail> getMails() {
		/* 67 */ return this.mails;
		/*    */ }

	/*    */
	/*    */ public Mail getMail() {
		/* 71 */ return this.mail;
		/*    */ }

	/*    */
	/*    */ public void setMail(Mail mail) {
		/* 75 */ this.mail = mail;
		/*    */ }

	/*    */
	/*    */ public TreeNode getMailbox() {
		/* 79 */ return this.mailbox;
		/*    */ }

	/*    */
	/*    */ public void setMailbox(TreeNode mailbox) {
		/* 83 */ this.mailbox = mailbox;
		/*    */ }

	/*    */
	/*    */ public void send() {
		/* 87 */ FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Mail Sent!"));
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\panel\MailboxView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */