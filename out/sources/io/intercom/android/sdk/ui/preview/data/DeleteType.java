package io.intercom.android.sdk.ui.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomPreviewArgs.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class DeleteType implements Parcelable {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
    public static final class Delete extends DeleteType {
        public static final int $stable = 0;
        public static final Delete INSTANCE = new Delete();
        public static final Parcelable.Creator<Delete> CREATOR = new Creator();

        /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
        public static final class Creator implements Parcelable.Creator<Delete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Delete createFromParcel(Parcel parcel) {
                i.e(parcel, "parcel");
                parcel.readInt();
                return Delete.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Delete[] newArray(int i10) {
                return new Delete[i10];
            }
        }

        private Delete() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            i.e(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
    public static final class None extends DeleteType {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                i.e(parcel, "parcel");
                parcel.readInt();
                return None.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i10) {
                return new None[i10];
            }
        }

        private None() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            i.e(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
    public static final class Remove extends DeleteType {
        public static final int $stable = 0;
        public static final Remove INSTANCE = new Remove();
        public static final Parcelable.Creator<Remove> CREATOR = new Creator();

        /* JADX INFO: compiled from: IntercomPreviewArgs.kt */
        public static final class Creator implements Parcelable.Creator<Remove> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remove createFromParcel(Parcel parcel) {
                i.e(parcel, "parcel");
                parcel.readInt();
                return Remove.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remove[] newArray(int i10) {
                return new Remove[i10];
            }
        }

        private Remove() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            i.e(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ DeleteType(e eVar) {
        this();
    }

    private DeleteType() {
    }
}
