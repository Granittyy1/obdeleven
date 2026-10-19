package Na;

import java.util.Iterator;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable<Character>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f4678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f4679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4680d = 1;

    public a(char c10, char c11) {
        this.f4678b = c10;
        this.f4679c = (char) C.n(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.f4678b, this.f4679c, this.f4680d);
    }
}
