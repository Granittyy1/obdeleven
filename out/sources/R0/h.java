package R0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: EmojiProcessor.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.c.d f5152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R0.d f5154c;

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class a implements b<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f5155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.emoji2.text.c.d f5156b;

        public a(p pVar, androidx.emoji2.text.c.d dVar) {
            this.f5155a = pVar;
            this.f5156b = dVar;
        }

        @Override // R0.h.b
        public final p a() {
            return this.f5155a;
        }

        @Override // R0.h.b
        public final boolean b(CharSequence charSequence, int i10, int i11, n nVar) {
            if ((nVar.f5186c & 4) > 0) {
                return true;
            }
            if (this.f5155a == null) {
                this.f5155a = new p(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f5156b.getClass();
            this.f5155a.setSpan(new o(nVar), i10, i11, 33);
            return true;
        }
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public interface b<T> {
        T a();

        boolean b(CharSequence charSequence, int i10, int i11, n nVar);
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5161a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.a f5162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l.a f5163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l.a f5164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5166f;

        public e(l.a aVar) {
            this.f5162b = aVar;
            this.f5163c = aVar;
        }

        public final void a() {
            this.f5161a = 1;
            this.f5163c = this.f5162b;
            this.f5166f = 0;
        }

        public final boolean b() {
            S0.a aVarC = this.f5163c.f5178b.c();
            int iA = aVarC.a(6);
            return !(iA == 0 || aVarC.f5345b.get(iA + aVarC.f5344a) == 0) || this.f5165e == 65039;
        }
    }

    public h(l lVar, androidx.emoji2.text.c.d dVar, R0.d dVar2, Set set) {
        this.f5152a = dVar;
        this.f5153b = lVar;
        this.f5154c = dVar2;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new d(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, n nVar) {
        if ((nVar.f5186c & 3) == 0) {
            R0.d dVar = this.f5154c;
            S0.a aVarC = nVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                aVarC.f5345b.getShort(iA + aVarC.f5344a);
            }
            dVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = R0.d.f5145b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f5146a;
            String string = sb2.toString();
            int i12 = p222s0.c.f46855a;
            boolean zA = s0.c.a.a(textPaint, string);
            int i13 = nVar.f5186c & 4;
            nVar.f5186c = zA ? i13 | 2 : i13 | 1;
        }
        return (nVar.f5186c & 3) == 2;
    }

    public final <T> T c(CharSequence charSequence, int i10, int i11, int i12, boolean z10, b<T> bVar) {
        int i13;
        char c10;
        e eVar = new e(this.f5153b.f5175c);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        boolean zB = true;
        int i14 = 0;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zB) {
                    SparseArray<l.a> sparseArray = eVar.f5163c.f5177a;
                    l.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                    if (eVar.f5161a == 2) {
                        if (aVar != null) {
                            eVar.f5163c = aVar;
                            eVar.f5166f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                eVar.a();
                            } else if (iCodePointAt != 65039) {
                                l.a aVar2 = eVar.f5163c;
                                if (aVar2.f5178b != null) {
                                    if (eVar.f5166f != 1) {
                                        eVar.f5164d = aVar2;
                                        eVar.a();
                                    } else if (eVar.b()) {
                                        eVar.f5164d = eVar.f5163c;
                                        eVar.a();
                                    } else {
                                        eVar.a();
                                    }
                                    c10 = 3;
                                } else {
                                    eVar.a();
                                }
                            }
                            c10 = 1;
                        }
                        c10 = 2;
                    } else if (aVar == null) {
                        eVar.a();
                        c10 = 1;
                    } else {
                        eVar.f5161a = 2;
                        eVar.f5163c = aVar;
                        eVar.f5166f = 1;
                        c10 = 2;
                    }
                    eVar.f5165e = iCodePointAt;
                    if (c10 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c10 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c10 == 3) {
                        if (!z10 && b(charSequence, i13, iCharCount, eVar.f5164d.f5178b)) {
                            break;
                        }
                        zB = bVar.b(charSequence, i13, iCharCount, eVar.f5164d.f5178b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (eVar.f5161a == 2 && eVar.f5163c.f5178b != null && ((eVar.f5166f > 1 || eVar.b()) && i14 < i12 && zB && (z10 || !b(charSequence, i13, iCharCount, eVar.f5163c.f5178b)))) {
            bVar.b(charSequence, i13, iCharCount, eVar.f5163c.f5178b);
        }
        return bVar.a();
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class c implements b<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5158b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5159c = -1;

        public c(int i10) {
            this.f5157a = i10;
        }

        @Override // R0.h.b
        public final boolean b(CharSequence charSequence, int i10, int i11, n nVar) {
            int i12 = this.f5157a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f5158b = i10;
            this.f5159c = i11;
            return false;
        }

        @Override // R0.h.b
        public final c a() {
            return this;
        }
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class d implements b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5160a;

        public d(String str) {
            this.f5160a = str;
        }

        @Override // R0.h.b
        public final boolean b(CharSequence charSequence, int i10, int i11, n nVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f5160a)) {
                return true;
            }
            nVar.f5186c = (nVar.f5186c & 3) | 4;
            return false;
        }

        @Override // R0.h.b
        public final d a() {
            return this;
        }
    }
}
