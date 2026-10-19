package p093h4;

/* JADX INFO: compiled from: SourceApplicationInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36173b;

    public l(String str, boolean z10) {
        this.f36172a = str;
        this.f36173b = z10;
    }

    public final String toString() {
        String str = this.f36173b ? "Applink" : "Unclassified";
        String str2 = this.f36172a;
        if (str2 == null) {
            return str;
        }
        return str + '(' + ((Object) str2) + ')';
    }
}
