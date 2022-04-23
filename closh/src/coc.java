import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.image.ImageObserver;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class coc extends JFrame
{
    private Image image;
    private Graphics graphics;
    Image grass;
    Image barracks;
    Image cannon;
    Image cannonleft;
    Image cannonright;
    Image goldmine;
    Image elixircollector;
    Image attackbutt;
    Image shopbutt;
    Image shop;
    Image barracksgui;
    Image evilgrass;
    Image archertower;
    Image goldstorage;
    Image goblin;
    Image barbarian;
    Image barbarianleft;
    Image barbarianright;
    Image archer;
    Image archerleft;
    Image archerright;
    Image rubble;
    Image giant;
    Image healer;
    Image waterwiz;
    Image firewiz;
    Image naturewiz;
    Image airwiz;
    Image upgradeButt;
    Image trainButt;
    Image elementselect;
    int base;
    int shopview;
    int attacking;
    int barracksOpen;
    int select;
    int maxgold;
    int maxelixir;
    int timer;
    int starttimer;
    int allBuildings;
    int mineselected;
    int mineX;
    int mineY;
    int gold;
    int goldrate;
    int goldhp;
    int goldUnlocked;
    int elixirselected;
    int ecollectorX;
    int ecollectorY;
    int elixir;
    int elixirrate;
    int elixirhp;
    int elixirUnlocked;
    int cannonselected;
    int cannonX;
    int cannonY;
    int cannonhp;
    int cannonUnlocked;
    int barrackselected;
    int barrackX;
    int barrackY;
    int barrackhp;
    int barracksUnlocked;
    int barrackOptions;
    int barracksLevel;
    int barracksUpgradeCost;
    Random archrandX;
    Random archrandY;
    int archertowerX;
    int archertowerY;
    int archtowerHealth;
    int archtowerAttack;
    int archTowAttack;
    Random goldstorandX;
    Random goldstorandY;
    int goldstorageX;
    int goldstorageY;
    int goldstorageHealth;
    int enemygold;
    int enemyHealth;
    int barbSpeedX;
    int barbSpeedY;
    int barbX;
    int barbY;
    int barbHealth;
    int barbAttack;
    int barbarianHorde;
    int barbDeployed;
    int wizards;
    int element;
    int elementSelect;
    int wizX;
    int wizY;
    int wizDeployed;
    int wizHealth;
    int wizBoltX;
    int wizBoltY;
    int boltSpeedX;
    int boltSpeedY;
    int wizDamage;
    int attacked;
    Random untilAttack;
    int attackBegin;
    int attackTimer;
    int goblinHorde;
    Random gobX;
    Random gobY;
    int goblinX;
    int goblinY;
    int goblinSpeedX;
    int goblinSpeedY;
    int goblinHealth;
    int gobDestroyed;

    public coc() {
        this.grass = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Grass.jpg").getImage();
        this.barracks = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Barrack.png").getImage();
        this.cannon = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Cannon.png").getImage();
        this.cannonleft = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Cannon_Left.gif").getImage();
        this.cannonright = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Cannon_Right.gif").getImage();
        this.goldmine = new ImageIcon("/Applications/JAVAClashOfClans/Assets/GoldMine.png").getImage();
        this.elixircollector = new ImageIcon("/Applications/JAVAClashOfClans/Assets/ElixirCollector.png").getImage();
        this.attackbutt = new ImageIcon("/Applications/JAVAClashOfClans/Assets/AttackButt.png").getImage();
        this.shopbutt = new ImageIcon("/Applications/JAVAClashOfClans/Assets/BuyButts.png").getImage();
        this.shop = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Shop.jpg").getImage();
        this.barracksgui = new ImageIcon("/Applications/JAVAClashOfClans/Assets/BarracksGUI.png").getImage();
        this.evilgrass = new ImageIcon("/Applications/JAVAClashOfClans/Assets/EvilGrass.png").getImage();
        this.archertower = new ImageIcon("/Applications/JAVAClashOfClans/Assets/ArcherTower.png").getImage();
        this.goldstorage = new ImageIcon("/Applications/JAVAClashOfClans/Assets/GoldStorage.png").getImage();
        this.goblin = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Goblin.png").getImage();
        this.barbarian = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Barbarian.png").getImage();
        this.barbarianleft = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Barbarian_Left.gif").getImage();
        this.barbarianright = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Barbarian_Right.gif").getImage();
        this.archer = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Archer.png").getImage();
        this.archerleft = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Archer_Left.gif").getImage();
        this.archerright = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Archer_Right.gif").getImage();
        this.rubble = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Rubble.png").getImage();
        this.giant = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Giant.png").getImage();
        this.healer = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Healer.gif").getImage();
        this.waterwiz = new ImageIcon("/Applications/JAVAClashOfClans/Wizards/Water.png").getImage();
        this.firewiz = new ImageIcon("/Applications/JAVAClashOfClans/Wizards/Fire.png").getImage();
        this.naturewiz = new ImageIcon("/Applications/JAVAClashOfClans/Wizards/Nature.png").getImage();
        this.airwiz = new ImageIcon("/Applications/JAVAClashOfClans/Wizards/Air.png").getImage();
        this.upgradeButt = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Upgrade.jpg").getImage();
        this.trainButt = new ImageIcon("/Applications/JAVAClashOfClans/Assets/Train.jpg").getImage();
        this.elementselect = new ImageIcon("/Applications/JAVAClashOfClans/Assets/ElementSelect.jpg").getImage();
        this.base = 1;
        this.shopview = 0;
        this.attacking = 0;
        this.barracksOpen = 0;
        this.select = 0;
        this.maxgold = 500;
        this.maxelixir = 500;
        this.timer = 0;
        this.starttimer = 0;
        this.mineselected = 0;
        this.mineX = 1000;
        this.gold = 350;
        this.goldrate = 0;
        this.goldhp = 100;
        this.goldUnlocked = 0;
        this.elixirselected = 0;
        this.ecollectorX = 1000;
        this.elixir = 500;
        this.elixirrate = 0;
        this.elixirhp = 100;
        this.elixirUnlocked = 0;
        this.cannonselected = 0;
        this.cannonX = 1000;
        this.cannonhp = 100;
        this.cannonUnlocked = 0;
        this.barrackselected = 0;
        this.barrackX = 1000;
        this.barrackhp = 100;
        this.barracksUnlocked = 0;
        this.barrackOptions = 0;
        this.barracksLevel = 0;
        this.barracksUpgradeCost = 100;
        this.archrandX = new Random();
        this.archrandY = new Random();
        this.archertowerX = this.archrandX.nextInt(801) + 100;
        this.archertowerY = this.archrandY.nextInt(501) + 100;
        this.archtowerHealth = 0;
        this.archtowerAttack = 1;
        this.archTowAttack = 0;
        this.goldstorandX = new Random();
        this.goldstorandY = new Random();
        this.goldstorageX = this.goldstorandX.nextInt(201) + this.archertowerX;
        this.goldstorageY = this.goldstorandY.nextInt(201) + this.archertowerY;
        this.goldstorageHealth = 0;
        this.enemygold = 500;
        this.enemyHealth = this.archtowerHealth + this.goldstorageHealth;
        this.barbSpeedX = 0;
        this.barbSpeedY = 0;
        this.barbX = 2000;
        this.barbY = 1400;
        this.barbHealth = 100;
        this.barbAttack = 1;
        this.barbarianHorde = 0;
        this.barbDeployed = 0;
        this.wizards = 0;
        this.element = 0;
        this.elementSelect = 0;
        this.wizHealth = 500;
        this.boltSpeedX = 0;
        this.boltSpeedY = 0;
        this.wizDamage = 10;
        this.attacked = 0;
        this.untilAttack = new Random();
        this.attackBegin = this.untilAttack.nextInt(500) + 500;
        this.attackTimer = 0;
        this.goblinHorde = 2;
        this.gobX = new Random();
        this.gobY = new Random();
        this.goblinX = 1000;
        this.goblinHealth = 0;
        this.gobDestroyed = 0;
        this.addMouseListener(new Handler());
    }

    @Override
    public void paint(final Graphics graphics) {
        this.image = this.createImage(this.getWidth(), this.getHeight());
        this.paintComponent(this.graphics = this.image.getGraphics());
        graphics.drawImage(this.image, 0, 0, null);
        this.repaint();
    }

    public void paintComponent(final Graphics graphics) {
        final int y = MouseInfo.getPointerInfo().getLocation().y;
        final int x = MouseInfo.getPointerInfo().getLocation().x;
        ++this.timer;
        if (this.timer == 30) {
            if (this.goldhp > 0) {
                this.gold += this.goldrate;
            }
            if (this.elixirhp > 0) {
                this.elixir += this.elixirrate;
            }
            this.timer = 0;
        }
        if (this.base == 1) {
            graphics.drawImage(this.grass, 0, 0, 1000, 700, null);
            if (this.attacked == 0) {
                graphics.drawImage(this.attackbutt, 0, 600, 100, 100, null);
                graphics.drawImage(this.shopbutt, 900, 600, 100, 100, null);
            }
            if (this.goldhp > 0) {
                graphics.drawImage(this.goldmine, this.mineX, this.mineY, 100, 100, null);
            }
            else {
                graphics.drawImage(this.rubble, this.mineX, this.mineY, 100, 100, null);
            }
            if (this.elixirhp > 0) {
                graphics.drawImage(this.elixircollector, this.ecollectorX, this.ecollectorY, 100, 100, null);
            }
            else {
                graphics.drawImage(this.rubble, this.ecollectorX, this.ecollectorY, 100, 100, null);
            }
            if (this.cannonhp > 0) {
                if (this.goblinX > this.cannonX - 200 && this.goblinX < this.cannonX + 200 && this.goblinY > this.cannonY - 200 && this.goblinY < this.cannonY + 200 && this.goblinX > this.cannonX) {
                    graphics.drawImage(this.cannonright, this.cannonX, this.cannonY, 100, 100, null);
                }
                else if (this.goblinX > this.cannonX - 200 && this.goblinX < this.cannonX + 200 && this.goblinY > this.cannonY - 200 && this.goblinY < this.cannonY + 200 && this.goblinX < this.cannonX) {
                    graphics.drawImage(this.cannonleft, this.cannonX, this.cannonY, 100, 100, null);
                }
                else {
                    graphics.drawImage(this.cannon, this.cannonX, this.cannonY, 100, 100, null);
                }
            }
            else {
                graphics.drawImage(this.rubble, this.cannonX, this.cannonY, 100, 100, null);
            }
            if (this.barrackhp > 0) {
                graphics.drawImage(this.barracks, this.barrackX, this.barrackY, 100, 100, null);
            }
            else {
                graphics.drawImage(this.rubble, this.barrackX, this.barrackY, 100, 100, null);
            }
            if (this.mineselected == 1) {
                this.mineX = x - 50;
                this.mineY = y - 50;
            }
            if (this.elixirselected == 1) {
                this.ecollectorX = x - 50;
                this.ecollectorY = y - 50;
            }
            if (this.cannonselected == 1) {
                this.cannonX = x - 50;
                this.cannonY = y - 50;
            }
            if (this.barrackselected == 1) {
                this.barrackX = x - 50;
                this.barrackY = y - 50;
            }
            if (this.goldstorageHealth <= 0 && this.archtowerHealth <= 0) {
                this.goldstorageX = this.goldstorandX.nextInt(201) + this.archertowerX;
                this.goldstorageY = this.goldstorandY.nextInt(201) + this.archertowerY;
                this.archertowerX = this.archrandX.nextInt(801) + 100;
                this.archertowerY = this.archrandY.nextInt(501) + 100;
                this.goldstorageHealth = 100;
                this.archtowerHealth = 100;
            }
            if (this.goldUnlocked != 0 || this.elixirUnlocked != 0 || this.cannonUnlocked != 0 || this.barracksUnlocked != 0) {
                ++this.attackTimer;
            }
            if (this.attackTimer == this.attackBegin) {
                this.attacked = 1;
                this.goblinY = this.gobY.nextInt(700);
            }
            if (this.attacked != 0 && this.shopview == 0 && this.barracksOpen == 0 && this.attacking == 0) {
                if (this.goblinHorde > 0 && this.goblinHealth <= 0) {
                    --this.goblinHorde;
                    this.goblinHealth = 100;
                    this.goblinX = 1000;
                    this.goblinY = this.gobY.nextInt(700);
                }
                if (this.goblinHealth > 0) {
                    graphics.drawImage(this.goblin, this.goblinX, this.goblinY, 100, 100, null);
                    this.goblinX += this.goblinSpeedX;
                    this.goblinY += this.goblinSpeedY;
                }
                if (this.goldhp > 0 && this.goldUnlocked != 0) {
                    if (this.goblinX > this.mineX) {
                        this.goblinSpeedX = -3;
                    }
                    else if (this.goblinX < this.mineX) {
                        this.goblinSpeedX = 3;
                    }
                    if (this.goblinY > this.mineY) {
                        this.goblinSpeedY = -3;
                    }
                    else if (this.goblinY < this.mineY) {
                        this.goblinSpeedY = 3;
                    }
                }
                else if ((this.goldhp <= 0 || this.goldUnlocked == 0) && this.elixirhp > 0 && this.elixirUnlocked != 0) {
                    if (this.goblinX > this.ecollectorX) {
                        this.goblinSpeedX = -3;
                    }
                    else if (this.goblinX < this.ecollectorX) {
                        this.goblinSpeedX = 3;
                    }
                    if (this.goblinY > this.ecollectorY) {
                        this.goblinSpeedY = -3;
                    }
                    else if (this.goblinY < this.ecollectorY) {
                        this.goblinSpeedY = 3;
                    }
                }
                else if ((this.elixirhp <= 0 || this.elixirUnlocked == 0) && this.cannonhp > 0 && this.cannonUnlocked != 0) {
                    if (this.goblinX > this.cannonX) {
                        this.goblinSpeedX = -3;
                    }
                    else if (this.goblinX < this.cannonX) {
                        this.goblinSpeedX = 3;
                    }
                    if (this.goblinY > this.cannonY) {
                        this.goblinSpeedY = -3;
                    }
                    else if (this.goblinY < this.cannonY) {
                        this.goblinSpeedY = 3;
                    }
                }
                else if ((this.cannonhp <= 0 || this.cannonUnlocked == 0) && this.barrackhp > 0 && this.barracksUnlocked != 0) {
                    if (this.goblinX > this.barrackX) {
                        this.goblinSpeedX = -3;
                    }
                    else if (this.goblinX < this.barrackX) {
                        this.goblinSpeedX = 3;
                    }
                    if (this.goblinY > this.barrackY) {
                        this.goblinSpeedY = -3;
                    }
                    else if (this.goblinY < this.barrackY) {
                        this.goblinSpeedY = 3;
                    }
                }
                if (this.cannonX > this.goblinX - 100 && this.cannonX < this.goblinX + 100 && this.cannonY > this.goblinY - 100 && this.cannonY < this.goblinY + 100 && this.goblinHealth > 0) {
                    --this.cannonhp;
                }
                if (this.ecollectorX > this.goblinX - 100 && this.ecollectorX < this.goblinX + 100 && this.ecollectorY > this.goblinY - 100 && this.ecollectorY < this.goblinY + 100 && this.goblinHealth > 0) {
                    --this.elixirhp;
                }
                if (this.mineX > this.goblinX - 100 && this.mineX < this.goblinX + 100 && this.mineY > this.goblinY - 100 && this.mineY < this.goblinY + 100 && this.goblinHealth > 0) {
                    --this.goldhp;
                }
                if (this.barrackX > this.goblinX - 100 && this.barrackX < this.goblinX + 100 && this.barrackY > this.goblinY - 100 && this.barrackY < this.goblinY + 100 && this.goblinHealth > 0) {
                    --this.barrackhp;
                }
                if (this.goblinX > this.cannonX - 200 && this.goblinX < this.cannonX + 200 && this.goblinY > this.cannonY - 200 && this.goblinY < this.cannonY + 200 && this.cannonhp > 0) {
                    --this.goblinHealth;
                }
                if (this.goldhp == 1) {
                    this.gold = 0;
                    ++this.gobDestroyed;
                }
                if (this.elixirhp == 1) {
                    this.elixir = 0;
                    ++this.gobDestroyed;
                }
                this.allBuildings = this.cannonUnlocked + this.barracksUnlocked + this.goldUnlocked + this.elixirUnlocked;
                if (this.allBuildings == this.gobDestroyed || (this.goblinHealth <= 0 && this.goblinHorde <= 0)) {
                    this.attacked = 0;
                    this.cannonhp = 100;
                    this.elixirhp = 100;
                    this.goldhp = 100;
                    this.barrackhp = 100;
                    this.attackBegin = this.untilAttack.nextInt(1000);
                    this.attackTimer = 0;
                    this.goblinHorde += 3;
                    this.goblinHealth = 100;
                    this.goblinX = 1000;
                    this.gobDestroyed = 0;
                }
                if (this.cannonhp == 1) {
                    ++this.gobDestroyed;
                }
                if (this.barrackhp == 1) {
                    ++this.gobDestroyed;
                }
                graphics.setColor(Color.RED);
                graphics.fillRect(this.cannonX, this.cannonY, 100, 10);
                graphics.fillRect(this.ecollectorX, this.ecollectorY, 100, 10);
                graphics.fillRect(this.mineX, this.mineY, 100, 10);
                graphics.fillRect(this.barrackX, this.barrackY, 100, 10);
                if (this.goblinHealth > 0) {
                    graphics.fillRect(this.goblinX, this.goblinY, 100, 10);
                }
                graphics.setColor(Color.GREEN);
                graphics.fillRect(this.cannonX, this.cannonY, this.cannonhp, 10);
                graphics.fillRect(this.ecollectorX, this.ecollectorY, this.elixirhp, 10);
                graphics.fillRect(this.mineX, this.mineY, this.goldhp, 10);
                graphics.fillRect(this.barrackX, this.barrackY, this.barrackhp, 10);
                graphics.fillRect(this.goblinX, this.goblinY, this.goblinHealth, 10);
                graphics.setColor(Color.BLACK);
            }
        }
        if (this.shopview == 1) {
            graphics.drawImage(this.shop, 0, 0, 1000, 700, null);
            graphics.drawImage(this.goldmine, 75, 300, 100, 100, null);
            graphics.drawImage(this.elixircollector, 300, 300, 100, 100, null);
            graphics.drawImage(this.cannon, 575, 300, 100, 100, null);
            graphics.drawImage(this.barracks, 825, 300, 100, 100, null);
        }
        if (this.barrackOptions != 0 && this.base != 0) {
            graphics.drawImage(this.upgradeButt, 400, 550, 50, 50, null);
            graphics.drawImage(this.trainButt, 500, 550, 50, 50, null);
        }
        if (this.barracksOpen == 1) {
            graphics.drawImage(this.barracksgui, 0, 0, 1000, 700, null);
            graphics.drawImage(this.barbarian, 120, 117, 150, 150, null);
            if (this.barracksLevel >= 2) {
                graphics.drawImage(this.giant, 420, 117, 100, 100, null);
            }
            if (this.barracksLevel >= 3) {
                graphics.drawImage(this.healer, 750, 117, 100, 100, null);
            }
            if (this.barracksLevel >= 4) {
                if (this.element == 1) {
                    graphics.drawImage(this.airwiz, 100, 400, 100, 100, null);
                }
                else if (this.element == 2) {
                    graphics.drawImage(this.waterwiz, 100, 400, 50, 100, null);
                }
                else if (this.element == 3) {
                    graphics.drawImage(this.firewiz, 100, 400, 50, 100, null);
                }
                else if (this.element == 4) {
                    graphics.drawImage(this.naturewiz, 100, 400, 50, 100, null);
                }
            }
            graphics.setFont(new Font("Arial", 0, 30));
            graphics.drawString("CLICK HERE TO EXIT", 10, 650);
            graphics.setFont(new Font("Arial", 0, 12));
        }
        if (this.attacking == 1) {
            this.enemyHealth = this.archtowerHealth + this.goldstorageHealth;
            graphics.drawImage(this.evilgrass, 0, 0, 1000, 700, null);
            if (this.archtowerHealth > 0) {
                graphics.drawImage(this.archertower, this.archertowerX - 100, this.archertowerY - 100, 200, 200, null);
                graphics.setColor(Color.GREEN);
                graphics.fillRect(this.archertowerX - 100, this.archertowerY - 100, this.archtowerHealth, 10);
            }
            if (this.goldstorageHealth > 0) {
                graphics.drawImage(this.goldstorage, this.goldstorageX - 100, this.goldstorageY - 100, 200, 200, null);
                graphics.setColor(Color.GREEN);
                graphics.fillRect(this.goldstorageX - 100, this.goldstorageY - 100, this.goldstorageHealth, 10);
                graphics.setColor(Color.WHITE);
                graphics.setFont(new Font("Arial", 0, 30));
                graphics.drawString("CLICK HERE TO EXIT", 500, 685);
                graphics.setFont(new Font("Arial", 0, 12));
                graphics.setColor(Color.BLACK);
            }
            graphics.drawString("Barbarian", 100, 600);
            if (this.barracksLevel >= 4) {
                graphics.drawString("Wizard", 200, 600);
            }
            graphics.setColor(Color.GREEN);
            if (this.select == 1) {
                graphics.drawRect(100, 590, 100, 20);
            }
            else if (this.select == 4 && this.barracksLevel >= 4) {
                graphics.drawRect(200, 590, 100, 20);
            }
            graphics.setColor(Color.BLACK);
            if (this.select != 1) {
                graphics.drawRect(100, 590, 100, 20);
            }
            if (this.select != 4 && this.barracksLevel >= 4) {
                graphics.drawRect(200, 590, 100, 20);
            }
            if (this.archtowerHealth > 0) {
                graphics.drawImage(this.archer, this.archertowerX - 50, this.archertowerY - 100, 100, 100, null);
            }
            if (this.barbDeployed == 1) {
                if (this.archtowerHealth > 0) {
                    if (this.barbX < this.archertowerX) {
                        ++this.barbX;
                        graphics.drawImage(this.barbarianright, this.barbX, this.barbY, 100, 100, null);
                    }
                    else if (this.barbX > this.archertowerX) {
                        --this.barbX;
                        graphics.drawImage(this.barbarianleft, this.barbX, this.barbY, 100, 100, null);
                    }
                    else {
                        graphics.drawImage(this.barbarian, this.barbX, this.barbY, 100, 100, null);
                    }
                    if (this.barbY < this.archertowerY) {
                        ++this.barbY;
                    }
                    else if (this.barbY > this.archertowerY) {
                        --this.barbY;
                    }
                    if (this.barbX < this.archertowerX) {
                        graphics.drawImage(this.archerleft, this.archertowerX - 50, this.archertowerY - 100, 100, 100, null);
                    }
                    else if (this.barbX > this.archertowerX) {
                        graphics.drawImage(this.archerright, this.archertowerX - 50, this.archertowerY - 100, 100, 100, null);
                    }
                }
                else if (this.archtowerHealth <= 0) {
                    if (this.barbX < this.goldstorageX) {
                        ++this.barbX;
                        graphics.drawImage(this.barbarianright, this.barbX, this.barbY, 100, 100, null);
                    }
                    else if (this.barbX > this.goldstorageX) {
                        --this.barbX;
                        graphics.drawImage(this.barbarianleft, this.barbX, this.barbY, 100, 100, null);
                    }
                    else {
                        graphics.drawImage(this.barbarian, this.barbX, this.barbY, 100, 100, null);
                    }
                    if (this.barbY < this.goldstorageY) {
                        ++this.barbY;
                    }
                    else if (this.barbY > this.goldstorageY) {
                        --this.barbY;
                    }
                }
            }
            this.wizBoltX += this.boltSpeedX;
            this.wizBoltY += this.boltSpeedY;
            if (this.wizDeployed != 0) {
                if (this.element == 1) {
                    graphics.drawImage(this.airwiz, this.wizX, this.wizY, 100, 100, null);
                    graphics.setColor(Color.WHITE);
                }
                else if (this.element == 2) {
                    graphics.drawImage(this.waterwiz, this.wizX, this.wizY, 50, 100, null);
                    graphics.setColor(Color.BLUE);
                }
                else if (this.element == 3) {
                    graphics.drawImage(this.firewiz, this.wizX, this.wizY, 50, 100, null);
                    graphics.setColor(Color.RED);
                }
                else if (this.element == 4) {
                    graphics.drawImage(this.naturewiz, this.wizX, this.wizY, 100, 200, null);
                    graphics.setColor(Color.GREEN);
                }
                if (this.wizX > this.archertowerX - 200 && this.wizX < this.archertowerX + 200 && this.wizY > this.archertowerY - 200 && this.wizY < this.archertowerY + 200) {
                    graphics.fillRect(this.wizBoltX, this.wizBoltY, 10, 10);
                }
                graphics.setColor(Color.BLACK);
                if (this.archtowerHealth > 0) {
                    if (this.wizX < this.archertowerX - 199) {
                        ++this.wizX;
                    }
                    if (this.wizX > this.archertowerX + 199) {
                        --this.wizX;
                    }
                    if (this.wizY < this.archertowerY - 199) {
                        ++this.wizY;
                    }
                    if (this.wizY > this.archertowerY + 199) {
                        --this.wizY;
                    }
                    if (this.wizX == this.archertowerX - 200 || this.wizX == this.archertowerX + 200 || this.wizY == this.archertowerY - 200 || this.wizY == this.archertowerY - 200 || this.boltSpeedX == 0) {
                        this.wizBoltX = this.wizX + 50;
                        this.wizBoltY = this.wizY + 50;
                    }
                    if (this.wizX > this.archertowerX - 200 && this.wizX < this.archertowerX + 200 && this.wizY > this.archertowerY - 200 && this.wizY < this.archertowerY + 200) {
                        this.boltSpeedX = (this.archertowerX - 100 - this.wizX) / 30;
                        this.boltSpeedY = (this.archertowerY - 100 - this.wizY) / 30;
                    }
                    if (this.wizBoltX > this.archertowerX - 100 && this.wizBoltX < this.archertowerX + 100 && this.wizBoltY > this.archertowerY - 100 && this.wizBoltY < this.archertowerY + 100) {
                        this.wizBoltX = this.wizX + 50;
                        this.wizBoltY = this.wizY + 50;
                        this.archtowerHealth -= this.wizDamage;
                    }
                    if (this.wizBoltY < 0 || this.wizBoltY > 700) {
                        this.wizBoltX = this.wizX + 50;
                        this.wizBoltY = this.wizY + 50;
                    }
                }
            }
            if (this.barbX > this.archertowerX - 200 && this.barbX < this.archertowerX + 200 && this.barbY > this.archertowerY - 200 && this.barbY < this.archertowerY + 200 && this.archtowerHealth > 0) {
                this.archTowAttack = 1;
                this.barbHealth -= this.archtowerAttack;
            }
            if (this.barbHealth <= 0) {
                this.barbDeployed = 0;
            }
            if (this.archertowerX > this.barbX - 100 && this.archertowerX < this.barbX + 100 && this.archertowerY > this.barbY - 100 && this.archertowerY < this.barbY + 100 && this.barbHealth > 0 && this.barbDeployed != 0) {
                this.archtowerHealth -= this.barbAttack;
            }
            if (this.goldstorageX > this.barbX - 100 && this.goldstorageX < this.barbX + 100 && this.goldstorageY > this.barbY - 100 && this.goldstorageY < this.barbY + 100 && this.barbHealth > 0 && this.barbDeployed != 0) {
                this.goldstorageHealth -= this.barbAttack;
            }
            if (this.goldstorageHealth <= 0) {
                if (this.gold < this.maxgold) {
                    this.gold += this.enemygold;
                }
                this.enemygold = 0;
            }
            if (this.archtowerHealth <= 0 && this.goldstorageHealth <= 0) {
                this.attacking = 0;
                this.base = 1;
                this.barbDeployed = 0;
            }
        }
        graphics.drawString("Gold: " + this.gold, 400, 650);
        graphics.drawString("Elixir: " + this.elixir, 600, 650);
        graphics.drawString("Barbarians: " + this.barbarianHorde, 200, 630);
        if (this.barracksLevel >= 2) {
            graphics.drawString("Giants: ", 300, 630);
        }
        if (this.barracksLevel >= 3) {
            graphics.drawString("Healers: ", 400, 630);
        }
        if (this.barracksLevel >= 4) {
            graphics.drawString("Wizards: " + this.wizards, 500, 630);
        }
        if (this.attacking == 1 && this.barbDeployed != 0) {
            graphics.setColor(Color.RED);
            graphics.fillRect(this.barbX, this.barbY, 100, 10);
            graphics.setColor(Color.GREEN);
            graphics.fillRect(this.barbX, this.barbY, this.barbHealth, 10);
            graphics.setColor(Color.BLACK);
        }
        if (this.gold > this.maxgold) {
            this.gold = this.maxgold;
        }
        if (this.elixir > this.maxelixir) {
            this.elixir = this.maxelixir;
        }
        if (this.base == 1 && this.attacking == 0) {
            graphics.drawString("Level: " + this.barracksLevel, this.barrackX, this.barrackY + 120);
            graphics.drawString("Upgrade Cost: " + this.barracksUpgradeCost + " elixir", this.barrackX, this.barrackY + 135);
        }
        if (this.elementSelect == 1) {
            graphics.drawImage(this.elementselect, 0, 0, 1000, 700, null);
        }
        if (this.barracksLevel == 4 && this.element == 0) {
            this.elementSelect = 1;
        }
        this.repaint();
    }

    public static void main(final String[] array) {
        final coc coc = new coc();
        coc.setVisible(true);
        coc.setSize(1000, 700);
    }

    private class Handler implements MouseListener
    {
        @Override
        public void mousePressed(final MouseEvent mouseEvent) {
            final int y = MouseInfo.getPointerInfo().getLocation().y;
            final int x = MouseInfo.getPointerInfo().getLocation().x;
            if (coc.this.base == 1) {
                if (x > 900 && y > 600) {
                    coc.this.shopview = 1;
                    coc.this.base = 0;
                    coc.this.repaint();
                }
                if (x > coc.this.barrackX && x < coc.this.barrackX + 100 && y > coc.this.barrackY && y < coc.this.barrackY + 100) {
                    coc.this.barrackOptions = 1;
                }
                if (x > 500 && x < 550 && y > 550 && y < 600 && coc.this.barrackOptions != 0) {
                    coc.this.barracksOpen = 1;
                }
                if (x > 400 && x < 450 && y > 550 && y < 600 && coc.this.elixir >= coc.this.barracksUpgradeCost && coc.this.barrackOptions != 0) {
                    coc.this.elixir -= coc.this.barracksUpgradeCost;
                    ++coc.this.barracksLevel;
                    coc.this.barracksUpgradeCost += 100;
                }
                if (coc.this.elementSelect == 1) {
                    if (x < 508) {
                        if (y < 350) {
                            coc.this.element = 2;
                            coc.this.elementSelect = 0;
                        }
                        if (y > 350) {
                            coc.this.element = 1;
                            coc.this.elementSelect = 0;
                        }
                    }
                    if (x > 508) {
                        if (y < 350) {
                            coc.this.element = 4;
                            coc.this.elementSelect = 0;
                        }
                        if (y > 350) {
                            coc.this.element = 3;
                            coc.this.elementSelect = 0;
                        }
                    }
                }
                if ((x < coc.this.barrackX || x > coc.this.barrackX + 100 || y < coc.this.barrackY || y > coc.this.barrackY + 100) && y < 550 && coc.this.barrackOptions != 0) {
                    coc.this.barrackOptions = 0;
                }
                if (coc.this.barracksOpen == 1 && y > 613) {
                    coc.this.barracksOpen = 0;
                    coc.this.base = 1;
                }
                if (coc.this.mineselected == 1) {
                    coc.this.mineselected = 0;
                    ++coc.this.goldrate;
                }
                if (coc.this.elixirselected == 1) {
                    coc.this.elixirselected = 0;
                    ++coc.this.elixirrate;
                }
                if (coc.this.cannonselected == 1) {
                    coc.this.cannonselected = 0;
                }
                if (coc.this.barrackselected == 1) {
                    coc.this.barrackselected = 0;
                }
                if (x > 0 && x < 100 && y > 600 && y < 700) {
                    coc.this.attacking = 1;
                    coc.this.select = 0;
                    coc.this.barbDeployed = 0;
                    coc.this.wizDeployed = 0;
                    coc.this.archtowerHealth = 100;
                    coc.this.goldstorageHealth = 100;
                    coc.this.enemygold = 500;
                    coc.this.wizBoltX = 3000;
                    coc.this.wizBoltY = 350;
                }
            }
            if (coc.this.shopview == 1) {
                if (x < 240 && coc.this.elixir >= 100 && y < 600) {
                    coc.this.elixir -= 100;
                    coc.this.mineselected = 1;
                    coc.this.base = 1;
                    coc.this.shopview = 0;
                    coc.this.goldUnlocked = 1;
                    coc.this.repaint();
                }
                else if (x > 240 && x < 500 && coc.this.gold >= 100 && y < 600) {
                    coc.this.gold -= 100;
                    coc.this.elixirselected = 1;
                    coc.this.base = 1;
                    coc.this.shopview = 0;
                    coc.this.elixirUnlocked = 1;
                    coc.this.repaint();
                }
                else if (x > 500 && x < 740 && coc.this.gold >= 250 && y < 600) {
                    coc.this.gold -= 250;
                    coc.this.cannonselected = 1;
                    coc.this.base = 1;
                    coc.this.shopview = 0;
                    coc.this.cannonUnlocked = 1;
                    coc.this.repaint();
                }
                else if (x > 740 && coc.this.elixir >= 200 && y < 600) {
                    coc.this.elixir -= 200;
                    coc.this.barrackselected = 1;
                    coc.this.base = 1;
                    coc.this.shopview = 0;
                    coc.this.barracksUnlocked = 1;
                    coc.this.barracksLevel = 1;
                    coc.this.repaint();
                }
            }
            if (coc.this.barracksOpen == 1) {
                if (x < 320 && x < 320 && y > 85 && y < 330 && coc.this.elixir >= 50) {
                    ++coc.this.barbarianHorde;
                    coc.this.elixir -= 50;
                }
                if (x < 320 && x < 320 && y > 360 && y < 605 && coc.this.elixir >= 100) {
                    ++coc.this.wizards;
                    coc.this.elixir -= 100;
                }
            }
        }

        @Override
        public void mouseClicked(final MouseEvent mouseEvent) {
            final int y = MouseInfo.getPointerInfo().getLocation().y;
            final int x = MouseInfo.getPointerInfo().getLocation().x;
            if (y > 650 && coc.this.shopview != 0) {
                coc.this.shopview = 0;
                coc.this.base = 1;
            }
            if (coc.this.attacking == 1) {
                if (y > 650 && x > 500) {
                    coc.this.attacking = 0;
                    coc.this.base = 1;
                }
                if (x > 100 && x < 200 && y > 590 && y < 620) {
                    coc.this.select = 1;
                }
                if (x > 200 && x < 300 && y > 590 && y < 620 && coc.this.barracksLevel >= 4) {
                    coc.this.select = 4;
                }
                if (coc.this.barbarianHorde > 0 && coc.this.select == 1) {
                    coc.this.barbX = x;
                    coc.this.barbY = y;
                    --coc.this.barbarianHorde;
                    coc.this.barbDeployed = 1;
                    coc.this.barbHealth = 100;
                }
                else if (coc.this.wizards > 0 && coc.this.select == 4) {
                    coc.this.wizX = x;
                    coc.this.wizY = y;
                    --coc.this.wizards;
                    coc.this.wizDeployed = 1;
                    coc.this.wizHealth = 100;
                    coc.this.wizBoltX = coc.this.wizX;
                    coc.this.wizBoltY = coc.this.wizY;
                }
            }
        }

        @Override
        public void mouseReleased(final MouseEvent mouseEvent) {
        }

        @Override
        public void mouseEntered(final MouseEvent mouseEvent) {
        }

        @Override
        public void mouseExited(final MouseEvent mouseEvent) {
        }
    }
}


