/**
  * Created by floris on 1/16/17.
  */

package main

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent, FMLServerStartingEvent}

@Mod(modid = "roads_rails", modLanguage = "scala")
object RoadsAndRails
{
  @Mod.EventHandler
  def preInit(event:FMLPreInitializationEvent){}

  @Mod.EventHandler
  def init(event:FMLInitializationEvent)
  {
    System.out.println("***********************************************")
    System.out.println("*                                             *")
    System.out.println("*       DIRT BLOCK >> Something Awesome       *")
    System.out.println("*                                             *")
    System.out.println("***********************************************")
  }

  @Mod.EventHandler
  def postInit(event:FMLPostInitializationEvent){}

  @Mod.EventHandler
  def onServerStarting(event:FMLServerStartingEvent){}

}
