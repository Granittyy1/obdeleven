package U3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.request.SingleRequest;
import com.google.android.gms.internal.measurement.M1;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class h<T extends View, Z> extends U3.a<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f6337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6338c;

    /* JADX INFO: compiled from: ViewTarget.java */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Integer f6339d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f6340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f6341b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0085a f6342c;

        /* JADX INFO: renamed from: U3.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewTarget.java */
        public static final class ViewTreeObserverOnPreDrawListenerC0085a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WeakReference<a> f6343b;

            public ViewTreeObserverOnPreDrawListenerC0085a(a aVar) {
                this.f6343b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = this.f6343b.get();
                if (aVar == null) {
                    return true;
                }
                ArrayList arrayList = aVar.f6341b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = aVar.f6340a;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int iA = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                int iA2 = aVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA <= 0 && iA != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a(iA, iA2);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.f6342c);
                }
                aVar.f6342c = null;
                arrayList.clear();
                return true;
            }
        }

        public a(ImageView imageView) {
            this.f6340a = imageView;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            ImageView imageView = this.f6340a;
            if (imageView.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            Context context = imageView.getContext();
            if (f6339d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                M1.d(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f6339d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f6339d.intValue();
        }
    }

    public h(ImageView imageView) {
        M1.d(imageView, "Argument must not be null");
        this.f6337b = imageView;
        this.f6338c = new a(imageView);
    }

    @Override // U3.g
    public final T3.b c() {
        Object tag = this.f6337b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof T3.b) {
            return (T3.b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // U3.g
    public final void d(SingleRequest singleRequest) {
        this.f6338c.f6341b.remove(singleRequest);
    }

    @Override // U3.g
    public final void f(SingleRequest singleRequest) throws Throwable {
        a aVar = this.f6338c;
        ImageView imageView = aVar.f6340a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = aVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = aVar.f6340a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA2 = aVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            singleRequest.a(iA, iA2);
            return;
        }
        ArrayList arrayList = aVar.f6341b;
        if (!arrayList.contains(singleRequest)) {
            arrayList.add(singleRequest);
        }
        if (aVar.f6342c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0085a viewTreeObserverOnPreDrawListenerC0085a = new a.ViewTreeObserverOnPreDrawListenerC0085a(aVar);
            aVar.f6342c = viewTreeObserverOnPreDrawListenerC0085a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0085a);
        }
    }

    @Override // U3.g
    public final void g(SingleRequest singleRequest) {
        this.f6337b.setTag(R.id.glide_custom_view_target_tag, singleRequest);
    }

    @Override // U3.g
    public void j(Drawable drawable) {
        a aVar = this.f6338c;
        ViewTreeObserver viewTreeObserver = aVar.f6340a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f6342c);
        }
        aVar.f6342c = null;
        aVar.f6341b.clear();
    }

    public final String toString() {
        return "Target for: " + this.f6337b;
    }
}
