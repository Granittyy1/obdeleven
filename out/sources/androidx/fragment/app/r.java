package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class r implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f17635b;

    public r(y yVar) {
        this.f17635b = yVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        G g10;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        y yVar = this.f17635b;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, yVar);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V0.a.f6662a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(C1351p.a(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentC = resourceId != -1 ? yVar.C(resourceId) : null;
                if (fragmentC == null && string != null) {
                    fragmentC = yVar.D(string);
                }
                if (fragmentC == null && id != -1) {
                    fragmentC = yVar.C(id);
                }
                if (fragmentC == null) {
                    C1351p c1351pJ = yVar.J();
                    context.getClassLoader();
                    fragmentC = Fragment.instantiate(y.this.f17696x.f17632c, attributeValue, null);
                    fragmentC.mFromLayout = true;
                    fragmentC.mFragmentId = resourceId != 0 ? resourceId : id;
                    fragmentC.mContainerId = id;
                    fragmentC.mTag = string;
                    fragmentC.mInLayout = true;
                    fragmentC.mFragmentManager = yVar;
                    AbstractC1352q<?> abstractC1352q = yVar.f17696x;
                    fragmentC.mHost = abstractC1352q;
                    fragmentC.onInflate((Context) abstractC1352q.f17632c, attributeSet, fragmentC.mSavedFragmentState);
                    g10 = yVar.a(fragmentC);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentC.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (fragmentC.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragmentC.mInLayout = true;
                    fragmentC.mFragmentManager = yVar;
                    AbstractC1352q<?> abstractC1352q2 = yVar.f17696x;
                    fragmentC.mHost = abstractC1352q2;
                    fragmentC.onInflate((Context) abstractC1352q2.f17632c, attributeSet, fragmentC.mSavedFragmentState);
                    g10 = yVar.g(fragmentC);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentC.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
                FragmentStrictMode.b(new FragmentTagUsageViolation(fragmentC, viewGroup));
                FragmentStrictMode.a(fragmentC).f17651a.contains(FragmentStrictMode.Flag.f17643c);
                fragmentC.mContainer = viewGroup;
                g10.i();
                g10.h();
                View view2 = fragmentC.mView;
                if (view2 == null) {
                    throw new IllegalStateException(androidx.compose.foundation.gestures.d.b("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentC.mView.getTag() == null) {
                    fragmentC.mView.setTag(string);
                }
                fragmentC.mView.addOnAttachStateChangeListener(new a(g10));
                return fragmentC.mView;
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ G f17636b;

        public a(G g10) {
            this.f17636b = g10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            G g10 = this.f17636b;
            g10.i();
            SpecialEffectsController.i((ViewGroup) g10.f17476c.mView.getParent(), r.this.f17635b).h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
