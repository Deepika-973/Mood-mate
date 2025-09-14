
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Project {

    static String userName = "";
    static JButton viewDiary;
    static String[] happyQuotes = {
        "Keep smiling, joy suits you! 😊",
        "Your happiness is shining through 🌟",
        "Happiness shared is happiness doubled! 💛",
        "You’re glowing with joy! Keep it up ☀",
        "Happiness is not by chance, but by choice.",
        "A smile is the universal welcome.",
        "The best way to cheer yourself is to try to cheer someone else up.",
        "Every day may not be good, but there’s something good in every day.",
        "Do more of what makes you happy.",
        "Smile, it’s the key that fits the lock of everybody’s heart."
    };
    static String[] sadQuotes = {
        "Tears are words the heart can't say.",
        "It's okay to not be okay sometimes.",
        "The worst kind of sad is not being able to explain why.",
        "Crying is how your heart speaks when your lips can't explain the pain.",
        "You never realize how strong you are until being strong is the only choice you have.",
        "I act like I’m fine, but inside I’m breaking.",
        "It hurts when you realize you aren't as important to someone as you thought you were.",
        "Sometimes the person who tries to keep everyone happy is the most lonely.",
        "The people who hide their feelings usually care the most.",
        "My silence is just another word for my pain."
    };
    static String[] angryQuotes = {
        "Take a deep breath. It's okay to feel angry sometimes.",
        "Let it out, not on others but through understanding. 😌",
        "Anger doesn't solve anything. But expressing it wisely can help.",
        "Breathe in calm, breathe out frustration. 🌬",
        "Speak when you’re calm, not when you’re angry.",
        "Even storms pass. You’ll feel lighter soon. ☁☀",
        "Holding on to anger is like holding a hot coal—you’re the one who gets burned.",
        "It’s okay to feel mad—just don’t let it own you.",
        "You are stronger than your anger. 💪",
        "Cool minds make better decisions. Let's cool off together. ❄"
    };
    static String[] sleepyQuotes = {
        "Rest now, you've done your best today. 🌙",
        "Even the stars are sleepy. Time to dream. ✨",
        "Close your eyes. The world can wait. 😴",
        "Goodnight, warrior. You’ve earned this rest.",
        "Sleep is the best meditation. — Dalai Lama",
        "Let go of today. Tomorrow is a fresh start.",
        "You deserve rest just as much as success. 💫",
        "Take a deep breath. Let your thoughts drift. 🌌",
        "In sleep, we heal. In dreams, we grow. 🌠",
        "Time to recharge, relax, and dream soft dreams. 💤"
    };
    static String[] boredQuotes = {
        "Boredom is the blank canvas for creativity. 🎨",
        "When you’re bored, your mind is asking for something meaningful. 🌱",
        "Even boredom is a sign you’re ready for something new. 🚀",
        "Turn boredom into a spark — do one small fun thing! ✨",
        "Being bored? That’s your mind saying: ‘Surprise me!’ 😄"
    };
    static String[] neutralQuotes = {
        "It’s okay to feel nothing in particular — just be. 🌿",
        "Some days are calm — let them be your reset. 🧘‍♀",
        "Not every moment needs a meaning. Silence is peaceful too. 🤍",
        "Even still waters reflect the sky. 🌊",
        "A quiet mind is a strong mind. Stay centered. 🌀"
    };
    static String[] tiredQuotes = {
        "You’ve done enough for today. It’s okay to rest. 🌙",
        "Rest isn’t a reward — it’s a necessity. 😌",
        "Tired minds need kindness, not judgment. 🤍",
        "Pause. Breathe. Tomorrow is waiting for you. 🌅",
        "Even machines need to recharge — so do you. 🔋"
    };
    static String[] frustratedQuotes = {
        "Frustration means you're trying — and that matters. 💪",
        "It’s okay to pause. Progress isn’t always perfect. 🛑➡🏁",
        "Take a breath. You’ve gotten through worse. 🌬",
        "Frustration is a sign of growth, not failure. 🌱",
        "Even messy moments have meaning. You’ve got this. 🌈"
    };
    static String[] relaxedQuotes = {
        "Peace begins with a deep breath. Inhale calm, exhale stress. 🌬",
        "You deserve this moment of quiet. Enjoy it fully. ☁",
        "Relax — not everything needs to be figured out today. 🕊",
        "Stillness is where clarity lives. 🧘‍♀",
        "Let your soul stretch out and rest. You've earned it. 🌿"
    };
    static String[] playfulQuotes = {
        "Life’s better when you’re laughing! 😂",
        "Stay silly, stay smiling! 😜",
        "You’re not bored — your imagination just needs a jumpstart! 🎨",
        "A little mischief makes life magical! ✨",
        "Why be serious when you can be playful? 🎭"
    };
    static String[] sickQuotes = {
        "Rest is part of healing — take it slow. 💚",
        "Your body is asking for care. Listen kindly. 🛌",
        "This too shall pass. You’ll feel better soon. 🌤",
        "Healing happens one deep breath at a time. 🌿",
        "It’s okay to pause. Health comes first. 🧸"
    };
    static String[] nervousQuotes = {
        "It’s okay to feel nervous — it means you care. 💙",
        "Take a deep breath. You’ve done hard things before. 🌬",
        "Courage isn’t the absence of fear, but moving forward despite it. 🦋",
        "Your feelings are valid. You're stronger than your doubt. 💪",
        "Every big moment starts with a little fear — and that’s normal. ✨"
    };
    static String[] loveTips = {
        "Love is not just about saying 'I love you' — it's about showing it daily.",
        "Real love listens more than it speaks.",
        "Even small acts of care can build lifelong trust.",
        "Being present is one of the purest forms of love.",
        "In love, respect is louder than any words."
    };
    static String[] confusedQuotes = {
        "It’s okay not to have all the answers right now. Trust the process. 🌱",
        "Confusion is the first step toward clarity. Keep going. 🔍",
        "Sometimes, being lost means you're about to find a better path. 🛤",
        "Don’t rush — even uncertainty has something to teach you. 🧠",
        "It’s normal to feel confused when you’re growing. Be kind to yourself. 💙"
    };
    static String[] worriedQuotes = {
        "Worrying doesn't take away tomorrow’s troubles — it takes away today’s peace. 🕊",
        "One step at a time. You don’t have to solve everything right now. 👣",
        "You’ve handled hard things before — and you will again. 💪",
        "Even in worry, your strength is quietly working. 🌱",
        "Breathe. You are doing better than you think. 🌬"
    };
    static String[] excitedQuotes = {
        "Your energy is contagious — keep shining! ✨",
        "Big smiles, big dreams — something wonderful is happening! 😄",
        "This excitement? You earned it. Soak it in! 🥳",
        "Moments like this are made to be remembered. 📸",
        "Let your joy be loud — the world needs your light. 🌟"
    };

    public static void main(String args[]) {
        JFrame frame;
        JLabel label;
        frame = new JFrame("MoodMate-Emotional Diary Assistant");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JPanel login = new JPanel();
        login.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        JPanel namePanel = new JPanel();
        JLabel name = new JLabel("Enter your name: ");
        JTextField text = new JTextField(15);
        JButton start = new JButton("Start MoodMate");
        namePanel.add(name);
        namePanel.add(text);
        login.add(namePanel);
        login.add(start);
        login.setVisible(true);
        JPanel moodPanel = new JPanel();
        moodPanel.setLayout(new BoxLayout(moodPanel, BoxLayout.Y_AXIS));
        moodPanel.setVisible(false);
        label = new JLabel("Welcome to MoodMate - Your Emotional Diary Assistant");
        Font font = new Font("Arial", Font.BOLD, 24);
        label.setFont(font);
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JLabel today = new JLabel("What's your mood today?");
        Font style = new Font("Comic Sans MS", Font.PLAIN, 15);
        today.setFont(style);
        today.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JButton happy = new JButton("😊 Happy");
        JButton sad = new JButton("☹ Sad");
        JButton angry = new JButton("😠 Angry");
        JButton sleepy = new JButton("😴 Sleepy");
        JButton bored = new JButton("😒 Bored");
        JButton neutral = new JButton("😐 Neutral");
        JButton tired = new JButton("😫 Tired");
        JButton frustated = new JButton("😤 Frustrated");
        JButton relaxed = new JButton("😌 Relaxed");
        JButton playful = new JButton("😜 Playful");
        JButton sick = new JButton("🤒 Sick");
        JButton nervous = new JButton("😬 Nervous");
        JButton inlove = new JButton("😍 In Love");
        JButton confused = new JButton("😕 Confused");
        JButton worried = new JButton("😟 Worried");
        JButton excited = new JButton("😃 Excited");
        JPanel forButton = new JPanel();
        forButton.setLayout(new GridLayout(0, 4, 30, 30));
        forButton.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        moodPanel.add(Box.createVerticalStrut(20));
        moodPanel.add(label);
        moodPanel.add(Box.createVerticalStrut(10));
        moodPanel.add(today);
        forButton.add(happy);
        forButton.add(sad);
        forButton.add(angry);
        forButton.add(sleepy);
        forButton.add(bored);
        forButton.add(neutral);
        forButton.add(tired);
        forButton.add(frustated);
        forButton.add(relaxed);
        forButton.add(playful);
        forButton.add(sick);
        forButton.add(nervous);
        forButton.add(inlove);
        forButton.add(confused);
        forButton.add(worried);
        forButton.add(excited);
        moodPanel.add(label);
        moodPanel.add(today);
        moodPanel.add(forButton);

        happy.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);

            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But I'm glad you're happy!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Happy");
                    pw.println("Reason:\n" + reason);
                    pw.close();
                    pw.println("----------------------------------");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = happyQuotes[new java.util.Random().nextInt(happyQuotes.length)];
                JOptionPane.showMessageDialog(null, "Happy mood saved!\n" + quote);
            }
        });

        sad.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);

            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But I'm sorry you're sad!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Sad");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = sadQuotes[new java.util.Random().nextInt(sadQuotes.length)];
                JOptionPane.showMessageDialog(null, "Sad mood saved!\n" + quote);
            }
        });

        angry.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);

            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But it was an angry day!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Angry");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = angryQuotes[new java.util.Random().nextInt(angryQuotes.length)];
                JOptionPane.showMessageDialog(null, "Angry mood saved!\n" + quote);
            }
        });

        sleepy.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But running low energy!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Sleepy");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = sleepyQuotes[new java.util.Random().nextInt(sleepyQuotes.length)];
                JOptionPane.showMessageDialog(null, "Sleepy mood saved!\n" + quote);
            }
        });
        bored.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But try/do something!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Bored");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = boredQuotes[new java.util.Random().nextInt(boredQuotes.length)];
                JOptionPane.showMessageDialog(null, "Bored mood saved!\n" + quote);
            }
        });
        neutral.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. Stay tuned!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Neutral");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = neutralQuotes[new java.util.Random().nextInt(neutralQuotes.length)];
                JOptionPane.showMessageDialog(null, "Neutral mood saved!\n" + quote);
            }
        });
        tired.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. Take some rest.");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Tired");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = tiredQuotes[new java.util.Random().nextInt(tiredQuotes.length)];
                JOptionPane.showMessageDialog(null, "Tired mood saved!\n" + quote);
            }
        });
        frustated.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But cool!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Frustrated");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = frustratedQuotes[new java.util.Random().nextInt(frustratedQuotes.length)];
                JOptionPane.showMessageDialog(null, "Frustrated mood saved!\n" + quote);
            }
        });
        relaxed.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. Just relax!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Relaxed");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = relaxedQuotes[new java.util.Random().nextInt(relaxedQuotes.length)];
                JOptionPane.showMessageDialog(null, "Relaxed mood saved!\n" + quote);
            }
        });
        playful.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. Have fun!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Playful");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = playfulQuotes[new java.util.Random().nextInt(playfulQuotes.length)];
                JOptionPane.showMessageDialog(null, "Playful mood saved!\n" + quote);
            }
        });
        sick.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. Take care of your health!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Sick");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = sickQuotes[new java.util.Random().nextInt(sickQuotes.length)];
                JOptionPane.showMessageDialog(null, "Sick mood saved!\n" + quote);
            }
        });
        frustated.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But cool!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Frustrated");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = frustratedQuotes[new java.util.Random().nextInt(frustratedQuotes.length)];
                JOptionPane.showMessageDialog(null, "Frustrated mood saved!\n" + quote);
            }
        });
        nervous.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But things will be alright!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Nervous");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = nervousQuotes[new java.util.Random().nextInt(nervousQuotes.length)];
                JOptionPane.showMessageDialog(null, "Nervous mood saved!\n" + quote);
            }
        });
        inlove.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. Live in love moment!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : In Love");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = loveTips[new java.util.Random().nextInt(loveTips.length)];
                JOptionPane.showMessageDialog(null, "In Love mood saved!\n" + quote);
            }
        });
        frustated.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But cool!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Frustrated");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = frustratedQuotes[new java.util.Random().nextInt(frustratedQuotes.length)];
                JOptionPane.showMessageDialog(null, "Frustrated mood saved!\n" + quote);
            }
        });
        confused.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. Confusion gives you clarity!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Confused");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = confusedQuotes[new java.util.Random().nextInt(confusedQuotes.length)];
                JOptionPane.showMessageDialog(null, "Confused mood saved!\n" + quote);
            }
        });
        worried.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But don't worry!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Worried");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = worriedQuotes[new java.util.Random().nextInt(worriedQuotes.length)];
                JOptionPane.showMessageDialog(null, "Worried mood saved!\n" + quote);
            }
        });
        excited.addActionListener(e -> {
            JTextArea t1 = new JTextArea(5, 30);
            t1.setLineWrap(true);
            JScrollPane js1 = new JScrollPane(t1);
            int result = JOptionPane.showConfirmDialog(null, js1, "Oh that's great! What happened today?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String reason = t1.getText().trim();
                if (reason.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No details saved. But enjoy in excited mood!");
                }
                try {
                    reason = t1.getText().trim();
                    FileWriter fw = new FileWriter("moodDiary.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    String datetime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
                    pw.println("[" + datetime + "] " + userName + " - Mood : Excited");
                    pw.println("Reason:\n" + reason);
                    pw.println("----------------------------------");
                    pw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                String quote = excitedQuotes[new java.util.Random().nextInt(excitedQuotes.length)];
                JOptionPane.showMessageDialog(null, "Excited mood saved!\n" + quote);
            }
        });
        viewDiary = new JButton("View My Diary");
        viewDiary.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        viewDiary.setFocusable(false);
        JButton exit = new JButton("Exit");
        exit.setFocusable(false);
        exit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 50));
        bottom.add(viewDiary);
        bottom.add(exit);
        moodPanel.add(bottom, BorderLayout.SOUTH);

        viewDiary.addActionListener(e -> {
            try {
                BufferedReader br = new BufferedReader(new FileReader("moodDiary.txt"));
                StringBuilder diary = new StringBuilder();
                String line;
                boolean var = false;

                while ((line = br.readLine()) != null) {
                    if (line.contains(userName)) {
                        var = true;
                        diary.append(line).append("\n");
                    } else if (var) {
                        if (line.trim().equals("----------------------------------")) {
                            diary.append("----------------------------------");
                            var = false;
                            diary.append(line).append("\n");
                        } else if (!line.trim().isEmpty()) {
                            diary.append(line).append("\n");
                        }
                    }
                }
                br.close();
                if (diary.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Diary is Empty");

                } else {
                    JTextArea textArea = new JTextArea(diary.toString());
                    textArea.setEditable(false);
                    JScrollPane scroll = new JScrollPane(textArea);
                    scroll.setPreferredSize(new Dimension(450, 300));
                    JOptionPane.showMessageDialog(null, scroll, "Mood Diary-" + userName, JOptionPane.PLAIN_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error reading file");
            }
        }
        );
        exit.addActionListener(e -> {
            System.exit(0);
        });
        frame.add(moodPanel);
        frame.add(login);
        start.addActionListener(e -> {
            userName = text.getText().trim();
            if (userName.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter your name.");
            } else {
                login.setVisible(false);
                moodPanel.setVisible(true);
            }
        });
        frame.setVisible(true);
        frame.setSize(500, 500);
    }
}
