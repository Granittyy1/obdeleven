package io.intercom.android.sdk.m5.navigation.transitions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TransitionStyle.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TransitionArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransitionArgs> CREATOR = new Creator();
    private final EnterTransitionStyle enter;
    private final ExitTransitionStyle exit;
    private final EnterTransitionStyle popEnter;
    private final ExitTransitionStyle popExit;

    /* JADX INFO: compiled from: TransitionStyle.kt */
    public static final class Creator implements Parcelable.Creator<TransitionArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new TransitionArgs(EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()), EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs[] newArray(int i10) {
            return new TransitionArgs[i10];
        }
    }

    public TransitionArgs() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransitionArgs copy$default(TransitionArgs transitionArgs, EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enterTransitionStyle = transitionArgs.enter;
        }
        if ((i10 & 2) != 0) {
            exitTransitionStyle = transitionArgs.exit;
        }
        if ((i10 & 4) != 0) {
            enterTransitionStyle2 = transitionArgs.popEnter;
        }
        if ((i10 & 8) != 0) {
            exitTransitionStyle2 = transitionArgs.popExit;
        }
        return transitionArgs.copy(enterTransitionStyle, exitTransitionStyle, enterTransitionStyle2, exitTransitionStyle2);
    }

    public final EnterTransitionStyle component1() {
        return this.enter;
    }

    public final ExitTransitionStyle component2() {
        return this.exit;
    }

    public final EnterTransitionStyle component3() {
        return this.popEnter;
    }

    public final ExitTransitionStyle component4() {
        return this.popExit;
    }

    public final TransitionArgs copy(EnterTransitionStyle enter, ExitTransitionStyle exit, EnterTransitionStyle popEnter, ExitTransitionStyle popExit) {
        i.e(enter, "enter");
        i.e(exit, "exit");
        i.e(popEnter, "popEnter");
        i.e(popExit, "popExit");
        return new TransitionArgs(enter, exit, popEnter, popExit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionArgs)) {
            return false;
        }
        TransitionArgs transitionArgs = (TransitionArgs) obj;
        return this.enter == transitionArgs.enter && this.exit == transitionArgs.exit && this.popEnter == transitionArgs.popEnter && this.popExit == transitionArgs.popExit;
    }

    public final EnterTransitionStyle getEnter() {
        return this.enter;
    }

    public final ExitTransitionStyle getExit() {
        return this.exit;
    }

    public final EnterTransitionStyle getPopEnter() {
        return this.popEnter;
    }

    public final ExitTransitionStyle getPopExit() {
        return this.popExit;
    }

    public int hashCode() {
        return this.popExit.hashCode() + ((this.popEnter.hashCode() + ((this.exit.hashCode() + (this.enter.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        String strEncode = Uri.encode(new Gson().h(this));
        i.d(strEncode, "encode(...)");
        return strEncode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeString(this.enter.name());
        dest.writeString(this.exit.name());
        dest.writeString(this.popEnter.name());
        dest.writeString(this.popExit.name());
    }

    public TransitionArgs(EnterTransitionStyle enter, ExitTransitionStyle exit, EnterTransitionStyle popEnter, ExitTransitionStyle popExit) {
        i.e(enter, "enter");
        i.e(exit, "exit");
        i.e(popEnter, "popEnter");
        i.e(popExit, "popExit");
        this.enter = enter;
        this.exit = exit;
        this.popEnter = popEnter;
        this.popExit = popExit;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransitionArgs(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i10, kotlin.jvm.internal.e eVar) {
        enterTransitionStyle = (i10 & 1) != 0 ? EnterTransitionStyle.NULL : enterTransitionStyle;
        exitTransitionStyle = (i10 & 2) != 0 ? ExitTransitionStyle.NULL : exitTransitionStyle;
        this(enterTransitionStyle, exitTransitionStyle, (i10 & 4) != 0 ? enterTransitionStyle : enterTransitionStyle2, (i10 & 8) != 0 ? exitTransitionStyle : exitTransitionStyle2);
    }
}
