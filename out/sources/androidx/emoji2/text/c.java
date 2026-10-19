package androidx.emoji2.text;

import R0.i;
import R0.l;
import R0.m;
import R0.p;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.collection.C0874b;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: EmojiCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile c f17342k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f17343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0874b f17344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f17345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f17346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f17347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f17348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f17349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final R0.d f17351i;

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile R0.h f17352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile l f17353c;
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f17354a;

        public b(c cVar) {
            this.f17354a = cVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class AbstractC0181c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f17355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17356b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final R0.d f17357c = new R0.d();

        public AbstractC0181c(g gVar) {
            this.f17355a = gVar;
        }
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static class d {
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f17358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17359c;

        public f(List list, int i10, Throwable th) {
            A0.f.f(list, "initCallbacks cannot be null");
            this.f17358b = new ArrayList(list);
            this.f17359c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f17358b;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f17359c != 1) {
                while (i10 < size) {
                    ((e) arrayList.get(i10)).a();
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((e) arrayList.get(i10)).b();
                    i10++;
                }
            }
        }
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public interface g {
        void a(h hVar);
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    public c(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f17343a = reentrantReadWriteLock;
        this.f17345c = 3;
        g gVar = aVar.f17355a;
        this.f17348f = gVar;
        int i10 = aVar.f17356b;
        this.f17350h = i10;
        this.f17351i = aVar.f17357c;
        this.f17346d = new Handler(Looper.getMainLooper());
        this.f17344b = new C0874b(0);
        this.f17349g = new d();
        a aVar2 = new a(this);
        this.f17347e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f17345c = 0;
            } catch (Throwable th) {
                this.f17343a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.b(aVar2));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static c a() {
        c cVar;
        synchronized (j) {
            try {
                cVar = f17342k;
                if (!(cVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static boolean d() {
        return f17342k != null;
    }

    public final int b(CharSequence charSequence, int i10) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        A0.f.f(charSequence, "charSequence cannot be null");
        R0.h hVar = this.f17347e.f17352b;
        hVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            i[] iVarArr = (i[]) spanned.getSpans(i10, i10 + 1, i.class);
            if (iVarArr.length > 0) {
                return spanned.getSpanStart(iVarArr[0]);
            }
        }
        return ((R0.h.c) hVar.c(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), BrazeLogger.SUPPRESS, true, new R0.h.c(i10))).f5158b;
    }

    public final int c() {
        this.f17343a.readLock().lock();
        try {
            return this.f17345c;
        } finally {
            this.f17343a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f17350h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f17343a.writeLock().lock();
        try {
            if (this.f17345c == 0) {
                this.f17343a.writeLock().unlock();
                return;
            }
            this.f17345c = 0;
            this.f17343a.writeLock().unlock();
            a aVar = this.f17347e;
            c cVar = aVar.f17354a;
            try {
                cVar.f17348f.a(new androidx.emoji2.text.b(aVar));
            } catch (Throwable th) {
                cVar.f(th);
            }
        } catch (Throwable th2) {
            this.f17343a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f17343a.writeLock().lock();
        try {
            this.f17345c = 2;
            arrayList.addAll(this.f17344b);
            this.f17344b.clear();
            this.f17343a.writeLock().unlock();
            this.f17346d.post(new f(arrayList, this.f17345c, th));
        } catch (Throwable th2) {
            this.f17343a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence g(int i10, int i11, int i12, CharSequence charSequence) {
        i[] iVarArr;
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        A0.f.c("start should be <= than end", i10 <= i11);
        p pVar = null;
        if (charSequence == null) {
            return null;
        }
        A0.f.c("start should be < than charSequence length", i10 <= charSequence.length());
        A0.f.c("end should be < than charSequence length", i11 <= charSequence.length());
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        boolean z10 = i12 == 1;
        R0.h hVar = this.f17347e.f17352b;
        hVar.getClass();
        boolean z11 = charSequence instanceof m;
        if (z11) {
            ((m) charSequence).a();
        }
        if (z11) {
            pVar = new p((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    pVar = new p((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, i.class) <= i11) {
                    pVar = new p();
                    pVar.f5188b = false;
                    pVar.f5189c = new SpannableString(charSequence);
                }
            } finally {
                if (z11) {
                    ((m) charSequence).b();
                }
            }
        }
        if (pVar != null && (iVarArr = (i[]) pVar.f5189c.getSpans(i10, i11, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = pVar.f5189c.getSpanStart(iVar);
                int spanEnd = pVar.f5189c.getSpanEnd(iVar);
                if (spanStart != i11) {
                    pVar.removeSpan(iVar);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        int i13 = i10;
        int i14 = i11;
        if (i13 != i14 && i13 < charSequence.length()) {
            p pVar2 = (p) hVar.c(charSequence, i13, i14, BrazeLogger.SUPPRESS, z10, new R0.h.a(pVar, hVar.f5152a));
            if (pVar2 != null) {
                return pVar2.f5189c;
            }
            if (!z11) {
                return charSequence;
            }
        } else if (!z11) {
            return charSequence;
        }
        return charSequence;
    }

    public final void h(e eVar) {
        A0.f.f(eVar, "initCallback cannot be null");
        this.f17343a.writeLock().lock();
        try {
            if (this.f17345c == 1 || this.f17345c == 2) {
                this.f17346d.post(new f(Arrays.asList(eVar), this.f17345c, null));
            } else {
                this.f17344b.add(eVar);
            }
        } finally {
            this.f17343a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        a aVar = this.f17347e;
        aVar.getClass();
        Bundle bundle = editorInfo.extras;
        S0.b bVar = aVar.f17353c.f5173a;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f5345b.getInt(iA + bVar.f5344a) : 0);
        Bundle bundle2 = editorInfo.extras;
        aVar.f17354a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    /* JADX INFO: compiled from: EmojiCompat.java */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }
}
