package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: FragmentPagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class D extends H2.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private I mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final y mFragmentManager;

    @Deprecated
    public D(y yVar) {
        this(yVar, 0);
    }

    private static String makeFragmentName(int i10, long j) {
        return "android:switcher:" + i10 + ":" + j;
    }

    @Override // H2.a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            y yVar = this.mFragmentManager;
            yVar.getClass();
            this.mCurTransaction = new C1336a(yVar);
        }
        C1336a c1336a = (C1336a) this.mCurTransaction;
        c1336a.getClass();
        y yVar2 = fragment.mFragmentManager;
        if (yVar2 != null && yVar2 != c1336a.f17569r) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        c1336a.b(new I.a(fragment, 6));
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // H2.a
    public void finishUpdate(ViewGroup viewGroup) {
        I i10 = this.mCurTransaction;
        if (i10 != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    C1336a c1336a = (C1336a) i10;
                    if (c1336a.f17490g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c1336a.f17491h = false;
                    c1336a.f17569r.A(c1336a, true);
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th) {
                    this.mExecutingFinishUpdate = false;
                    throw th;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i10);

    public long getItemId(int i10) {
        return i10;
    }

    @Override // H2.a
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        if (this.mCurTransaction == null) {
            y yVar = this.mFragmentManager;
            yVar.getClass();
            this.mCurTransaction = new C1336a(yVar);
        }
        long itemId = getItemId(i10);
        Fragment fragmentD = this.mFragmentManager.D(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentD != null) {
            I i11 = this.mCurTransaction;
            i11.getClass();
            i11.b(new I.a(fragmentD, 7));
        } else {
            fragmentD = getItem(i10);
            this.mCurTransaction.d(viewGroup.getId(), fragmentD, makeFragmentName(viewGroup.getId(), itemId), 1);
        }
        if (fragmentD != this.mCurrentPrimaryItem) {
            fragmentD.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.f(fragmentD, Lifecycle.State.f17752e);
            } else {
                fragmentD.setUserVisibleHint(false);
            }
        }
        return fragmentD;
    }

    @Override // H2.a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // H2.a
    public Parcelable saveState() {
        return null;
    }

    @Override // H2.a
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        y yVar = this.mFragmentManager;
                        yVar.getClass();
                        this.mCurTransaction = new C1336a(yVar);
                    }
                    this.mCurTransaction.f(this.mCurrentPrimaryItem, Lifecycle.State.f17752e);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    y yVar2 = this.mFragmentManager;
                    yVar2.getClass();
                    this.mCurTransaction = new C1336a(yVar2);
                }
                this.mCurTransaction.f(fragment, Lifecycle.State.f17753f);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // H2.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public D(y yVar, int i10) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = yVar;
        this.mBehavior = i10;
    }

    @Override // H2.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }
}
