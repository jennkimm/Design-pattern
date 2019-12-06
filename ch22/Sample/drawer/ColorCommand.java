package ch22.Sample.drawer;

import ch22.Sample.command.*;
import java.awt.Color;

public class ColorCommand implements Command {
    // �׸��� ���
    protected Drawable drawable;
    // �׸��� ��
    private Color color;
    // ������
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    // ����
    public void execute() {
        drawable.setColor(color);
    }
}
