package norswap.sigh.types;

public final class QuestionType extends Type
{
    public static final QuestionType INSTANCE = new QuestionType();
    private QuestionType () {}

    @Override public boolean isPrimitive () {
        return true;
    }

    @Override public String name() {
        return "Question";
    }
}
