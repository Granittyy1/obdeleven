package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CLParsingException (");
        sb2.append(hashCode());
        sb2.append(") : ");
        sb2.append(this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")");
        return sb2.toString();
    }
}
