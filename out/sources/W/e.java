package W;

import V.q;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: WordIterator.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f6992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BreakIterator f6995d;

    /* JADX INFO: compiled from: WordIterator.android.kt */
    public static final class a {
        public static boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public e(CharSequence charSequence, int i10, Locale locale) {
        this.f6992a = charSequence;
        if (charSequence.length() < 0) {
            Y.a.a("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            Y.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f6995d = wordInstance;
        this.f6993b = Math.max(0, -50);
        this.f6994c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new q(charSequence, i10));
    }

    public final void a(int i10) {
        boolean z10 = false;
        int i11 = this.f6993b;
        int i12 = this.f6994c;
        if (i10 <= i12 && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbA = B6.a.a("Invalid offset: ", ". Valid range is [", " , ", i10, i11);
        sbA.append(i12);
        sbA.append(']');
        Y.a.a(sbA.toString());
    }

    public final boolean b(int i10) {
        int i11 = this.f6993b + 1;
        if (i10 > this.f6994c || i11 > i10) {
            return false;
        }
        CharSequence charSequence = this.f6992a;
        if (Character.isLetterOrDigit(Character.codePointBefore(charSequence, i10))) {
            return true;
        }
        int i12 = i10 - 1;
        if (Character.isSurrogate(charSequence.charAt(i12))) {
            return true;
        }
        if (!androidx.emoji2.text.c.d()) {
            return false;
        }
        androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
        return cVarA.c() == 1 && cVarA.b(charSequence, i12) != -1;
    }

    public final boolean c(int i10) {
        int i11 = this.f6993b + 1;
        if (i10 > this.f6994c || i11 > i10) {
            return false;
        }
        return a.a(Character.codePointBefore(this.f6992a, i10));
    }

    public final boolean d(int i10) {
        a(i10);
        if (this.f6995d.isBoundary(i10) && (!f(i10) || !f(i10 - 1) || !f(i10 + 1))) {
            if (i10 <= 0 || i10 >= this.f6992a.length() - 1) {
                return true;
            }
            if (!e(i10) && !e(i10 + 1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(int i10) {
        int i11 = i10 - 1;
        CharSequence charSequence = this.f6992a;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        return (i.a(unicodeBlockOf, unicodeBlock) && i.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) || (i.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), unicodeBlock) && i.a(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA));
    }

    public final boolean f(int i10) {
        if (i10 >= this.f6994c || this.f6993b > i10) {
            return false;
        }
        CharSequence charSequence = this.f6992a;
        if (Character.isLetterOrDigit(Character.codePointAt(charSequence, i10)) || Character.isSurrogate(charSequence.charAt(i10))) {
            return true;
        }
        if (!androidx.emoji2.text.c.d()) {
            return false;
        }
        androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
        return cVarA.c() == 1 && cVarA.b(charSequence, i10) != -1;
    }

    public final boolean g(int i10) {
        if (i10 >= this.f6994c || this.f6993b > i10) {
            return false;
        }
        return a.a(Character.codePointAt(this.f6992a, i10));
    }

    public final int h(int i10) {
        a(i10);
        int iFollowing = this.f6995d.following(i10);
        return (f(iFollowing + (-1)) && f(iFollowing) && !e(iFollowing)) ? h(iFollowing) : iFollowing;
    }

    public final int i(int i10) {
        a(i10);
        int iPreceding = this.f6995d.preceding(i10);
        return (f(iPreceding) && b(iPreceding) && !e(iPreceding)) ? i(iPreceding) : iPreceding;
    }
}
