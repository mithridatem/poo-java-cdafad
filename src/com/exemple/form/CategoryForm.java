package com.exemple.form;

import com.exemple.entity.Category;
import com.exemple.repository.CategoryRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoryForm extends JDialog {
    //Zone principale (equivalent BODY HTML)
    private JPanel jpMain;
    //Eléments du formulaire
    private JLabel jTitle;
    private JTextField tfName;
    private JButton btAdd;

    public CategoryForm(JDialog parent)
    {
        super(parent);
        //Ajouter un titre à la fenêtre
        setTitle("Ajouter une catégorie");
        //Définir le cadre principal
        setContentPane(jpMain);
        //Régler la taille min / max
        setMinimumSize(new Dimension(800,600));
        setMaximumSize(new Dimension(800,600));
        setModal(false);
        //rendre visible à l'écran
        setVisible(true);
        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addcategory();
            }
        });
    }

    private void addcategory()
    {
       Category category = new Category();
       category.setName(tfName.getText());

       //ajout en BDD
        CategoryRepository  categoryRepository = new CategoryRepository();
        try {
            categoryRepository.save(category);
        } catch (Exception ex) {}

        JOptionPane.showMessageDialog(
                this,
                "La categorie a été ajouté en BDD",
                "Enregistrement de la categorie",
                JOptionPane.PLAIN_MESSAGE
        );

    }
}
