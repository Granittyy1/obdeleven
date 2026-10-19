package p126k0;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41227a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41228b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41229c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f41230d;

    public abstract void a(HashMap<String, p113j0.d> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract d clone();

    public d c(d dVar) {
        this.f41227a = dVar.f41227a;
        this.f41228b = dVar.f41228b;
        this.f41229c = dVar.f41229c;
        this.f41230d = dVar.f41230d;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> map) {
    }
}
