package com.lyb.designmode.single_instance.kotlin

class SingleSafeLazyInstanceKotlin private constructor(){
    companion object{
        private @Volatile var instance: SingleSafeLazyInstanceKotlin? = null
        get() {
            if(field == null){
                field = SingleSafeLazyInstanceKotlin()
            }
            return field;
        }

        @Synchronized
        fun get() : SingleSafeLazyInstanceKotlin {

            return instance!!;

        }

    }

}