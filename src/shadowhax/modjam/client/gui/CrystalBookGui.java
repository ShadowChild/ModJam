package shadowhax.modjam.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CrystalBookGui extends GuiScreen
{
        private static final ResourceLocation guiTexture = new ResourceLocation("");

		/** The player editing the book */
        private final EntityPlayer editingPlayer;

        /** Update ticks since the gui was opened */
        private int updateCount;
        private int bookImageWidth = 192;
        private int bookImageHeight = 192;
        private int bookTotalPages = 1;
        private int currPage;
        private NBTTagList bookPages;
        private String bookTitle = "";
        //private GuiButtonNextPage buttonNextPage;
        //private GuiButtonNextPage buttonPreviousPage;
        private GuiButton buttonDone;


        public CrystalBookGui(EntityPlayer par1EntityPlayer)
        {
                this.editingPlayer = par1EntityPlayer;
        }

        /**
         * Called from the main game loop to update the screen.
         */
        public void updateScreen()
        {
                super.updateScreen();
                ++this.updateCount;
        }

        /**
         * Adds the buttons (and other controls) to the screen in question.
         */
        public void initGui()
        {
                this.buttonList.clear();
                Keyboard.enableRepeatEvents(true);
                this.buttonList.add(this.buttonDone = new GuiButton(0, this.width / 2 - 100, 4 + this.bookImageHeight, 200, 20, StatCollector.translateToLocal("gui.done")));

                int i = (this.width - this.bookImageWidth) / 2;
                byte b0 = 2;
                //this.buttonList.add(this.buttonNextPage = new GuiButton(1, i + 120, b0 + 154, true));
                //this.buttonList.add(this.buttonPreviousPage = new GuiButton(2, i + 38, b0 + 154, false));
                //this.updateButtons();
        }

        /**
         * Called when the screen is unloaded. Used to disable keyboard repeat events
         */
        public void onGuiClosed()
        {
                Keyboard.enableRepeatEvents(false);
        }

        /**
        private void updateButtons()
        {
                //this.buttonNextPage.drawButton = !this.editingTitle && (this.currPage < this.bookTotalPages - 1 || this.bookIsUnsigned);
                //this.buttonPreviousPage.drawButton = !this.editingTitle && this.currPage > 0;
        }

        private void sendBookToServer(boolean par1)
        {
                if (this.bookIsUnsigned && this.bookModified)
                {
                        if (this.bookPages != null)
                        {
                                while (this.bookPages.tagCount() > 1)
                                {
                                        NBTTagString nbttagstring = (NBTTagString)this.bookPages.tagAt(this.bookPages.tagCount() - 1);

                                        if (nbttagstring.data != null && nbttagstring.data.length() != 0)
                                        {
                                                break;
                                        }

                                        this.bookPages.removeTag(this.bookPages.tagCount() - 1);
                                }

                                if (this.itemstackBook.hasTagCompound())
                                {
                                        NBTTagCompound nbttagcompound = this.itemstackBook.getTagCompound();
                                        nbttagcompound.setTag("pages", this.bookPages);
                                }
                                else
                                {
                                        this.itemstackBook.setTagInfo("pages", this.bookPages);
                                }

                                String s = "MC|BEdit";

                                if (par1)
                                {
                                        s = "MC|BSign";
                                        this.itemstackBook.setTagInfo("author", new NBTTagString("author", this.editingPlayer.username));
                                        this.itemstackBook.setTagInfo("title", new NBTTagString("title", this.bookTitle.trim()));
                                        this.itemstackBook.itemID = Item.writtenBook.itemID;
                                }

                                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                                DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

                                try
                                {
                                        Packet.writeItemStack(this.itemstackBook, dataoutputstream);
                                        this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload(s, bytearrayoutputstream.toByteArray()));
                                }
                                catch (Exception exception)
                                {
                                        exception.printStackTrace();
                                }
                        }
                }
        }
**/
        /**
         * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
         */
        protected void actionPerformed(GuiButton par1GuiButton)
        {
                if (par1GuiButton.enabled)
                {
                        if (par1GuiButton.id == 0)
                        {
                                this.mc.displayGuiScreen((GuiScreen)null);
                           // this.sendBookToServer(false);
                        }
                        else if (par1GuiButton.id == 1)
                        {
                                if (this.currPage < this.bookTotalPages - 1)
                                {
                                        ++this.currPage;
                                }
                        }
                        else if (par1GuiButton.id == 2)
                        {
                                if (this.currPage > 0)
                                {
                                        --this.currPage;
                                }
                        }
                        //this.updateButtons();
                }
        }

        /**
        private void addNewPage()
        {
                if (this.bookPages != null && this.bookPages.tagCount() < 50)
                {
                        this.bookPages.appendTag(new NBTTagString("" + (this.bookTotalPages + 1), ""));
                        ++this.bookTotalPages;
                        this.bookModified = true;
                }
        }**/

        /**
         * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
         */
        /**
        protected void keyTyped(char par1, int par2)
        {
                super.keyTyped(par1, par2);

                if (this.bookIsUnsigned)
                {
                        if (this.editingTitle)
                        {
                                this.func_74162_c(par1, par2);
                        }
                        else
                        {
                                this.keyTypedInBook(par1, par2);
                        }
                }
        }**/

        /**
         * Processes keystrokes when editing the text of a book
         */
        /**
        private void keyTypedInBook(char par1, int par2)
        {
                switch (par1)
                {
                        case 22:
                                this.func_74160_b(GuiScreen.getClipboardString());
                                return;
                        default:
                                switch (par2)
                                {
                                        case 14:
                                                String s = this.func_74158_i();

                                                if (s.length() > 0)
                                                {
                                                        this.func_74159_a(s.substring(0, s.length() - 1));
                                                }

                                                return;
                                        case 28:
                                                this.func_74160_b("\n");
                                                return;
                                        default:
                                                if (ChatAllowedCharacters.isAllowedCharacter(par1))
                                                {
                                                        this.func_74160_b(Character.toString(par1));
                                                }
                                }
                }
        }

        private void func_74162_c(char par1, int par2)
        {
                switch (par2)
                {
                        case 14:
                                if (this.bookTitle.length() > 0)
                                {
                                        this.bookTitle = this.bookTitle.substring(0, this.bookTitle.length() - 1);
                                        this.updateButtons();
                                }

                                return;
                        case 28:
                                if (this.bookTitle.length() > 0)
                                {
                                        this.sendBookToServer(true);
                                        this.mc.displayGuiScreen((GuiScreen)null);
                                }

                                return;
                        default:
                                if (this.bookTitle.length() < 16 && ChatAllowedCharacters.isAllowedCharacter(par1))
                                {
                                        this.bookTitle = this.bookTitle + Character.toString(par1);
                                        this.updateButtons();
                                        this.bookModified = true;
                                }
                }
        }

        private String func_74158_i()
        {
                if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount())
                {
                        NBTTagString nbttagstring = (NBTTagString)this.bookPages.tagAt(this.currPage);
                        return nbttagstring.toString();
                }
                else
                {
                        return "";
                }
        }

        private void func_74159_a(String par1Str)
        {
                if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount())
                {
                        NBTTagString nbttagstring = (NBTTagString)this.bookPages.tagAt(this.currPage);
                        nbttagstring.data = par1Str;
                        this.bookModified = true;
                }
        }

        private void func_74160_b(String par1Str)
        {
                String s1 = this.func_74158_i();
                String s2 = s1 + par1Str;
                int i = this.fontRenderer.splitStringWidth(s2 + "" + EnumChatFormatting.BLACK + "_", 118);

                if (i <= 118 && s2.length() < 256)
                {
                        this.func_74159_a(s2);
                }
        }**/

        /**
         * Draws the screen and all the components in it.
         */
        public void drawScreen(int par1, int par2, float par3)
        {
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        		this.mc.func_110434_K().func_110577_a(guiTexture);
                int k = (this.width - this.bookImageWidth) / 2;
                byte b0 = 2;
                this.drawTexturedModalRect(k, b0, 0, 0, this.bookImageWidth, this.bookImageHeight);
                String s;
                String s1;
                int l;
/**
                        s = String.format(StatCollector.translateToLocal("book.pageIndicator"), new Object[] {Integer.valueOf(this.currPage + 1), Integer.valueOf(this.bookTotalPages)});
                        s1 = "";

                        if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount())
                        {
                                NBTTagString nbttagstring = (NBTTagString)this.bookPages.tagAt(this.currPage);
                                s1 = nbttagstring.toString();
                        }**/

                        //s1 = s1 + "" + EnumChatFormatting.GRAY + "_";
                        s = EnumChatFormatting.BOLD + "The Ancient Quire";
                        s1 = "In this ancient dwarf book you will find all your recipes you've learned. You can look up descriptions and recipes again if you want to. Also all informations you collected will be stored here.";

                        l = this.fontRenderer.getStringWidth(s);
                        this.fontRenderer.drawString(s, k - l + this.bookImageWidth - 44, b0 + 16, 0);
                        this.fontRenderer.drawSplitString(s1, k + 36, b0 + 16 + 16, 116, 0);

                super.drawScreen(par1, par2, par3);
        }
}

 