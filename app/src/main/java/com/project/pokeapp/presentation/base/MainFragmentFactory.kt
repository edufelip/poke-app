package com.project.pokeapp.presentation.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class MainFragmentFactory : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            else -> super.instantiate(classLoader, className)
        }
    }
}