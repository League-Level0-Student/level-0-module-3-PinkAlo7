package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		int dragon = JOptionPane.showOptionDialog(null,
				"Once upon a time, there was a girl named Lele who loved dragons and she wanted to find a dragon and keep it for herself,"
						+ "\nso she went out and decided that she was going to find a dragon for herself. Then she walking on a path which lead to 2 paths, one going right, the "
						+ "\nother going left, she didn't know which path she should take. Which path do you think she should take?",
				"The Dragon Girl", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Left", " Right" }, null);
		System.out.println(dragon);
		if (dragon == 1) {
			JOptionPane.showMessageDialog(null,
					"So Lele she took the right path and she found the most horrible looking thing...not a dragon...AN ORPHANAGE!"
							+ "she was terrified at the sight, but when she tried to go back, a creepy, cripled, old lady had already closed it! 'Please,let me out! I did not "
							+ "\nmean to come here!!'exlaimed Lele. 'Oh, it's alright my sweet darling, you will live a wonderful life at the orphanage, and wait until you see the owner of "
							+ "\nthe orphanage, oh isn't she so pretty!'said the old lady"
							+ "\nso Lele was taken to the orphanage and when she saw the owner of the orphanage, she gasped, the pale lady had black pig-tail braids, brown eyes, and the lady"
							+ "\nwas...Wednesday! Yes I mean the one and only wednesday from Adams Family. "
							+ "\n'And who is this you have here?' asked Wednesday. 'My lady, this is, uh what is your name?', asked the old lady. 'L-Lele' stammered Lele. 'Her name is Lele"
							+ "\n'This is Lele my lady.', 'I have the perfect place for her...she can mop the floors and dust the windows in the orphanage!' 'What!'exlaimed Lele. 'Take her "
							+ "\naway!' ordered Wednesday. "
							+ "\nAnd for the rest of lele's life, she mopped and dusted, and never was able to find her dragon...THE END!");
		}

		if (dragon == 0) {
			int ldragon = JOptionPane.showOptionDialog(null,
					"So Lele took the left path, and she couldn't believe her eyes, it looked like a dream land! It was so beautiful and full of teal"
							+ "\n(teal was her favorite color)clouds, and there was so much warm, well done steak! But there was something else by the steak...not a dragon...A GIANT! The Giant saw "
							+ "\nher and said 'I'm tired of eating steak for dinner, I want to eat that little girl for dinner! Come here you! Lele screamed and ran for her life."
							+ "\nThe giant was running after her and he was getting closer. Then she saw a sword next to a gun. She didn't know which weapon she should use. You "
							+ "\nshould choose for her. Should Lele use a gun or a sword? ",
					"The Dragon Girl", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Gun", " Sword" },
					null);
			if (ldragon == 0) {
				JOptionPane.showMessageDialog(null,
						"Lele immediately snatched the gun and started shooting the giant, but when she started shooting, the bullets were too small. When the bullets "
								+ "\nshot him, it only felt like little pinches to the giant. 'Your gun is no match for me little girl!' yelled the giant. The giant got closer and closer to Lele and ate her!!! THE END! ");
			}
			if (ldragon == 1) {
				int sword = JOptionPane.showOptionDialog(null,
						"Lele immediately snatched the sword and ran back to the giant. She lifted her sword and periced the sword in the gaint's stomach! The giant was dead! "
								+ "\nLele had won her victory."
								+ "\nLele stopped to pick up some steak and then proceeded to the dragon land(she was in steak land)."
								+ "\nShe then passed a beautiful land full of books! Millions of books filled the book land that Lele couldn't see where she was going! She decided to climb on the books to get a bigger "
								+ "\nview of where she was going. She saw a sign that said, 'Go right if you want to pass Art Land, go left if you want to pass Rice Krispie Land.' Both sounded so good, but lele didn't "
								+ "\nknow which one to choose. You should decide. Should Lele go to Art Land or Rice Crispie Land?",
						"The Dragon Girl", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Art Land", "Rice Crispie Land", }, null);
				if (sword == 1) {
					JOptionPane.showMessageDialog(null,
							"Lele decided she wanted to go to Rice Krispie Land. Rice Krispies did sound good after she had just had steak. When lele entered Rice Krispie land, there was"
									+ "\nrice krispie everywhere! She jumped in the pile of rice krispies and started eating, Before Lele had started eating, there was a sign that she missed that said, 'Do NOT eat the rice "
									+ "\nkrispie! When lele started eating a huge rice krispe monster formed and looked mad at Lele. if you ate the rice krispie, you were eating his body! Lele noticed that the rice krispie was"
									+ "\ndisappearing up into the air and when Lele looked up, she saw the rice krispie monster! 'How dare you eat my body little girl!' exlaimed the rice krispie monster. 'I'm sorry! I didn't"
									+ "\nknow I wasn't supposed to eat you!' yelled Lele in fear. 'The sign is krispie clear!' said the monster in anger. The sign really was krispie clear...IT WAS COVERED IN RICE KRISPIE! "
									+ "\n'Because you ate my body I will eat yours!!!' yelled the monster. The rice krispie monster ran after Lele and ate her...THE END!");
				}
				if (sword == 0) {
					int art = JOptionPane.showOptionDialog(null,
							"Lele decided she wanted to go to Art Land. Art Land did sound fun, she wanted to color pictures of dragons. When Lele entered Art Land, it was full of markers coloring pencils, pencils, paint, lots"
									+ "\n of paper, pencil sharpeners, and all kinds of things you would need to color! Lele quickly got some markers and started drawing dragons. She was very good at drawing dragons. She stayed in Art "
									+ "\nLand for an hour coloring dragons, and when she thought she had drawn enough dragons, she packed some markers, paint brushes, and her drawings and continued on her journey. "
									+ "\nThe next land she saw was sleepy land. This land was full of beds, stars, moons, pajamas, pillows, and sleeping masks. All of a sudden Lele was feeling sleepy. She really wanted to go to sleep"
									+ "\nwhen she saw all of the comfy beds. What do you think...should she sleep or keep making her way to Dragon Land? ",
							"The Dragon Girl", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "Keep making her way to Dragon Land", "Sleep" }, null);
					if (art == 0) {
						JOptionPane.showMessageDialog(null,
								"Even though Lele was very tired, she still wanted to get a dragon as soon as possible. So Lele continued on her journey, but right when she was about to leave sleepy"
										+ "\nland, she saw a sign that said,'if you don't sleep in 5 seconds you will die!' Lele laughed. 'I would never die just because I didn't sleep' said Lele, but suddenly, she fell to the ground "
										+ "\nand was in a deep sleep...FOREVER!...THE END!");
					}
					if (art == 1) {
						int sleep = JOptionPane.showOptionDialog(null,
								"Lele cound't help it, so she found the most comfy bed she could find and immediately started sleeping."
										+ "\nThe next day, Lele got up and packed her bags and continued on her journey. The next land she came to was Cheese Land. This land was full of all types of cheese: Gooda cheese, chedar cheese, "
										+ "\nstring cheese, goat cheese, and muche more! Lele hadn't eaten anything that morning and ran to the cheese and started eating. While Lele was eating, she heard a rumble on the ground and little "
										+ "\nsqeaks everywhere. Suddenly, thousands of mice ran towards her and pushed her and ate the cheese. Lele was being carried by the mice evrywhere she didn't get another chance to eat another bite"
										+ "\nof cheese. The mice kept carrying her everywhere so fast that Lele fell off of the mice. Lele wanted to eat the cheese so badly, but the mice were all over the cheese that you couldn't see the "
										+ "\ncheese. Should Lele try to get some cheese to eat or keep making her way to Dragon Land?",
								"The Dragon Girl", 0, JOptionPane.INFORMATION_MESSAGE, null,
								new String[] { "Get some cheese", " Keep making her way to Dragon Land" }, null);
						if (sleep == 1) {
							JOptionPane.showMessageDialog(null,
									"Even though Lele was so hungry, she still wanted to get a dragon as soon as possible. so she continued on her journey and looked to see if she happened to see and other food lands"
											+ "\nbut Cheese Land was the last land she had seen that had food. Lele's stomach was growling so much. She suddenly fell to the ground and died from hunger...THE END!");
						}if (sleep == 0) {
								JOptionPane.showMessageDialog(null,
										"Lele was very hungry, so she ran towards the cheese and pushed the mice out of her way and climbed on top of the cheese. She grabbed as much cheese as she could and when she grabbed as much as she "
												+ "\ncould, she jumped off the cheese and ran towards an area without mice. she then continued on her journey. The next land was....DRAGON LAND! She had finally made it to Dragon Land. There were so"
												+ "\nmany dragons that were so beautiful that she didn't know which one to pick! Lele was so exited that she had found Dragon Land and ran towards the dragons and pet them. She wanted to fly on them,"
												+ "\nso she hopped on a dragon and immediately soared into the air. She could see a view of all of the lands she had went through. Then she landed the dragon and looked very sad. 'I wish I could take "
												+ "\nall of these dragons, but I can only ride one of them home. Then Lele thought of an idea,'Wait! if I want all of the dragons then I could live with them! I do always feel lonely at home, and all"
												+ "\nof these dragons are so beautiful!' Lele exlaimed. "
												+ "\nSo Lele decided that she was going to live with the dragons and lived happily ever after, the end. ");

							}
						}

					}
				}

			}

		}
	}

