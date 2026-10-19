package W6;

import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: FiamImageLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.e f7010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7011b = new HashMap();

    /* JADX INFO: compiled from: FiamImageLoader.java */
    public static abstract class a extends U3.c<Drawable> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f7012e;

        @Override // U3.g
        public final void b(Object obj) {
            Drawable drawable = (Drawable) obj;
            H3.c.j();
            ImageView imageView = this.f7012e;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            l();
        }

        @Override // U3.c, U3.g
        public final void h(Drawable drawable) {
            H3.c.j();
            ImageView imageView = this.f7012e;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            new Exception("Image loading failed!");
            U6.e eVar = (U6.e) this;
            H3.c.k("Image download failure ");
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = eVar.f6541h;
            if (onGlobalLayoutListener != null) {
                eVar.f6539f.d().getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
            }
            U6.b bVar = eVar.f6542i;
            p pVar = bVar.f6522e;
            CountDownTimer countDownTimer = pVar.f7037a;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                pVar.f7037a = null;
            }
            p pVar2 = bVar.f6523f;
            CountDownTimer countDownTimer2 = pVar2.f7037a;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                pVar2.f7037a = null;
            }
            bVar.f6527k = null;
            bVar.f6528l = null;
        }

        @Override // U3.g
        public final void j(Drawable drawable) {
            H3.c.j();
            ImageView imageView = this.f7012e;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            l();
        }

        public abstract void l();
    }

    /* JADX INFO: compiled from: FiamImageLoader.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public U6.e f7013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7014b;

        public b(com.bumptech.glide.d<Drawable> dVar) {
        }

        public final void a() {
            Set hashSet;
            if (this.f7013a == null || TextUtils.isEmpty(this.f7014b)) {
                return;
            }
            synchronized (f.this.f7011b) {
                try {
                    if (f.this.f7011b.containsKey(this.f7014b)) {
                        hashSet = (Set) f.this.f7011b.get(this.f7014b);
                    } else {
                        hashSet = new HashSet();
                        f.this.f7011b.put(this.f7014b, hashSet);
                    }
                    if (!hashSet.contains(this.f7013a)) {
                        hashSet.add(this.f7013a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public f(com.bumptech.glide.e eVar) {
        this.f7010a = eVar;
    }
}
