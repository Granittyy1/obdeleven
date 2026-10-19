package p147l9;

import B8.E0;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import p110i9.q;
import p220r9.C2786s;
import p255u9.E;

/* JADX INFO: compiled from: VehicleAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends q<E, a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f44503i;
    public final ArrayList j;

    /* JADX INFO: compiled from: VehicleAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FrameLayout f44504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public FrameLayout f44505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f44506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ProgressBar f44507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f44508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f44509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f44510h;
    }

    public h(MainActivity mainActivity, int i10) {
        super(mainActivity);
        this.f44503i = true;
        this.j = new ArrayList();
        this.f44502h = i10;
    }

    @Override // p110i9.h
    public final void c(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        E e10 = (E) this.f36795b.get(i10);
        View view = aVar.itemView;
        String str = "vehicleListImageTransition_" + e10.getObjectId();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.v(view, str);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f44502h);
        if (i10 == 0) {
            layoutParams.setMargins(0, C2786s.a(this.f36794a.getResources(), -6.0f) + 1, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        aVar.f44505c.setLayoutParams(layoutParams);
        aVar.f44507e.setVisibility(0);
        FrameLayout frameLayout = aVar.f44504b;
        frameLayout.setVisibility(8);
        String strF = e10.f();
        frameLayout.setVisibility(0);
        ImageView imageView = aVar.f44506d;
        d<Drawable> dVarM = b.d(imageView).m(strF);
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
        i.d(dVarJ, "placeholder(...)");
        d<Drawable> dVarA = dVarM.a(dVarJ);
        dVarA.y(new f(aVar));
        dVarA.x(imageView);
        String strK = e10.k();
        String strD = e10.d();
        String strE = e10.e();
        boolean zIsEmpty = strE.isEmpty();
        TextView textView = aVar.f44510h;
        TextView textView2 = aVar.f44508f;
        if (!zIsEmpty) {
            textView2.setText(strE);
        } else if (strD.isEmpty()) {
            textView2.setText(e10.k());
            textView.setVisibility(8);
        } else {
            textView2.setText(strD);
        }
        textView.setText(strK);
        textView.setVisibility(8);
        aVar.f44509g.setText(e10.getString("year"));
    }

    @Override // p110i9.h
    public final RecyclerView.B e(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View viewInflate = LayoutInflater.from(this.f36794a).inflate(R.layout.item_vehicle, viewGroup, false);
        viewInflate.getLayoutParams().height = this.f44502h;
        a aVar = new a(viewInflate);
        aVar.f44504b = (FrameLayout) viewInflate.findViewById(R.id.imageFrame);
        aVar.f44505c = (FrameLayout) viewInflate.findViewById(R.id.containerLayout);
        aVar.f44506d = (ImageView) viewInflate.findViewById(R.id.image);
        aVar.f44507e = (ProgressBar) viewInflate.findViewById(R.id.progress);
        aVar.f44508f = (TextView) viewInflate.findViewById(R.id.modelText);
        aVar.f44509g = (TextView) viewInflate.findViewById(R.id.yearText);
        aVar.f44510h = (TextView) viewInflate.findViewById(R.id.vinText);
        return aVar;
    }

    @Override // p110i9.h
    public final void f(RecyclerView.B b10) {
        a aVar = (a) b10;
        synchronized (this) {
            try {
                if (this.f44503i) {
                    long size = ((long) this.j.size()) * 25;
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f36794a, android.R.anim.slide_in_left);
                    animationLoadAnimation.setStartOffset(size);
                    animationLoadAnimation.setAnimationListener(new g(this, aVar));
                    this.j.add(aVar.itemView);
                    aVar.itemView.startAnimation(animationLoadAnimation);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p110i9.h
    public final void g(RecyclerView.B b10) {
        a aVar = (a) b10;
        this.j.remove(aVar.itemView);
        aVar.itemView.clearAnimation();
    }
}
