package game.model;

public class Square {
    private boolean isEmpty;
    private boolean hasApple;
    private boolean hasBody;
    /**
     * isOutOFBounds hier existiert um den Rand der Arena klar zu machen, indem die Arena größer gemacht wird, jedoch die äußeren
     * Vierecke als außerhalb zählen, damit wir einfach ein Rand haben, ohne intern Probleme mit outOfBounds zu haben.
     */
    private boolean isOutOfBounds;
    private int bodyAge;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isHasApple() {
        return hasApple;
    }

    public void setHasApple(boolean hasApple) {
        this.hasApple = hasApple;
    }

    public boolean isHasBody() {
        return hasBody;
    }

    public void setHasBody(boolean hasBody) {
        this.hasBody = hasBody;
    }

    public boolean isOutOfBounds() {
        return isOutOfBounds;
    }

    public void setOutOfBounds(boolean outOfBounds) {
        isOutOfBounds = outOfBounds;
    }

    public int getBodyAge() {
        return bodyAge;
    }

    public void setBodyAge(int bodyAge) {
        this.bodyAge = bodyAge;
    }
}
