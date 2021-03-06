package org.redfrog404.mobycraft.utils;

import static org.redfrog404.mobycraft.commands.common.MainCommand.sender;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class MessageSender {
	
	public static void sendMessage(Object message) {
		if (sender != null) {
			sender.addChatMessage(new ChatComponentText(message.toString()));
		}
		else {
			System.out.println(message.toString());
		}
	}

	public static void sendErrorMessage(String message) {
		sendMessage(EnumChatFormatting.DARK_RED + message);
	}

	public static void sendConfirmMessage(String message) {
		sendMessage(EnumChatFormatting.GREEN + message);
	}

	public static void sendFeedbackMessage(String message) {
		sendMessage(EnumChatFormatting.GOLD + message);
	}

	public static void sendBarMessage(EnumChatFormatting color) {
		sendMessage(color + "" + EnumChatFormatting.BOLD
				+ "=============================================");
	}

}
