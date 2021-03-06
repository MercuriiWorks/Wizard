package engine.core.collection

import engine.core.Destroyable

open class DestroyableHashMap<K, V: Destroyable> : HashMap<K, V>() {

    override fun remove(key: K): V? {
        return super.remove(key)?.apply {
            onDestroy()
        }
    }

    override fun remove(key: K, value: V): Boolean {
        return super.remove(key, value.apply {
            onDestroy()
        })
    }

    override fun clear() {
        for (value in values) {
            value.onDestroy()
        }
        super.clear()
    }
}